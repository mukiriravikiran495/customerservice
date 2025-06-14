package com.customerservice.controller;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.constants.AppConstants;
import com.customerservice.domain.CustomerBookingResponseDTO;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.exceptions.InvalidRequestException;
import com.customerservice.exceptions.StatusHandler;
import com.customerservice.service.CustomerService;
import com.customerservice.utils.JwtUtil;

@RestController
@RequestMapping( path = "/v1/api/cust")
public class CustomerServiceController {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private final JwtUtil jwtUtil;
	private final CustomerService service;
	
	public CustomerServiceController(JwtUtil jwtUtil, CustomerService service) {
		this.jwtUtil = jwtUtil;
		this.service = service;
	}
	
//	@GetMapping( value = "/auth/token")
//	public ResponseEntity<TokenID> getToken() {
//		String token = jwtUtil.generateTokenId();
//		TokenID tokenId = new TokenID();
//		tokenId.setToken(token.trim());
//		long timestamp = new Date().getTime();
//		tokenId.setExpires(timestamp);
//		tokenId.setStatus("200");
//		tokenId.setResult(AppConstants.TOKEN_GENERATED_SUCCESSFULLY);
//		return new ResponseEntity<>(tokenId, HttpStatus.OK);
//	}
	
	@PostMapping( value = "/create")
	public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerDetailsDTO customerDetailsDTO){
		logger.info("START : CREATE CUSTOMER Controller : "+ customerDetailsDTO);
		CustomerResponse response = new CustomerResponse();
		StatusHandler statusHandler = new StatusHandler();
		response = service.createCustomer(customerDetailsDTO, response, statusHandler);
		ResponseEntity<CustomerResponse> cust = new ResponseEntity<>(response, HttpStatus.OK);
		logger.info("END : Create Customer Controller : "+response);
		return cust;
	}
	
	@GetMapping("/customer/{custId}")
    public ResponseEntity<List<CustomerBookingResponseDTO>> getBookingsByCustomer(@PathVariable Long custId) throws InvalidRequestException {
		logger.info("START Customer Bookings Controller : ");
		if(null == custId) {
			throw new InvalidRequestException(AppConstants.INVALID_REQUEST);
		}
        List<CustomerBookingResponseDTO> bookings = service.getBookingsByCustomerId(custId);
        logger.info("END : Customer Bookings Controller : ");
        return ResponseEntity.ok(bookings);
    }
	
	@GetMapping( value = "/customer/{custId}/{bookingId}")
	public ResponseEntity<CustomerBookingResponseDTO> getBookingsByBookingId(@PathVariable Long custId, 
																	  @PathVariable Long bookingId) {
		logger.info("START : Get Bookings By ID Controller : "+custId+" : "+bookingId);
		StatusHandler statusHandler = new StatusHandler();
		CustomerBookingResponseDTO customerBookingResponse = new CustomerBookingResponseDTO();
		try {
			if( null == custId || null == bookingId ) {
				throw new InvalidRequestException(AppConstants.INVALID_REQUEST);
			}
			customerBookingResponse = service.getBookingsByBookingId(custId, bookingId, statusHandler, customerBookingResponse);
			ResponseEntity<CustomerBookingResponseDTO> response = new ResponseEntity<>(customerBookingResponse, HttpStatus.OK);
			logger.info("END : Get Bookings By ID Controller : "+customerBookingResponse);
			return response;
			
		}catch(InvalidRequestException ex) {
			statusHandler.setErrorCode("400");
			statusHandler.setErrorMessage(AppConstants.INVALID_REQUEST);
			customerBookingResponse.setStatusHandler(statusHandler);
			return new ResponseEntity<>(customerBookingResponse, HttpStatus.BAD_REQUEST);
		}catch(Exception e) {
			statusHandler.setErrorCode("400");
			statusHandler.setErrorMessage(e.getMessage());
			customerBookingResponse.setStatusHandler(statusHandler);
			return new ResponseEntity<>(customerBookingResponse, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
}


















