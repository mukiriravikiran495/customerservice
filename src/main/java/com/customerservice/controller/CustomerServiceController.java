package com.customerservice.controller;

import java.lang.invoke.MethodHandles;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.constants.AppConstants;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.domain.TokenID;
import com.customerservice.exceptions.InvalidRequestException;
import com.customerservice.exceptions.StatusHandler;
import com.customerservice.service.CustomerService;
import com.customerservice.utils.JwtUtil;

@RestController
@RequestMapping( path = "/v1/api/customer")
public class CustomerServiceController {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private final JwtUtil jwtUtil;
	private final CustomerService service;
	
	public CustomerServiceController(CustomerService service, JwtUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
		this.service = service;
	}
	
	@GetMapping( value = "/auth/token")
	public ResponseEntity<TokenID> getToken() {
		String token = jwtUtil.generateTokenId();
		TokenID tokenId = new TokenID();
		tokenId.setToken(token.trim());
		long timestamp = new Date().getTime();
		tokenId.setExpires(timestamp);
		tokenId.setStatus("200");
		tokenId.setResult(AppConstants.TOKEN_GENERATED_SUCCESSFULLY);
		return new ResponseEntity<>(tokenId, HttpStatus.OK);
	}
	
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
	
	@GetMapping( value = "/get/{custId}")
	public ResponseEntity<CustomerResponse> getCustomerDetails(@PathVariable Long custId, @RequestHeader HttpHeaders headers){
		logger.info("Start : get customer details controller : "+custId);
		System.out.println("heanders : "+headers);
		StatusHandler statusHandler = new StatusHandler();
		CustomerResponse response = new CustomerResponse();
		System.out.println("custId : "+custId);
		try {
			if(null == custId) {
				throw new InvalidRequestException(AppConstants.INVALID_REQUEST);
			}
			response = service.getCustomerDetails(custId, response, statusHandler);
			statusHandler.setStatusCode("200");
			statusHandler.setMessage(AppConstants.SUCCESS);
			response.setStatusHandler(statusHandler);
			System.out.println(response);
		}catch(InvalidRequestException ex) {
			statusHandler.setStatusCode("400");
			statusHandler.setMessage(AppConstants.INVALID_REQUEST);
			response.setStatusHandler(statusHandler);
		}catch(Exception ex) {
			statusHandler.setStatusCode("500");
			statusHandler.setMessage(ex.getMessage());
			response.setStatusHandler(statusHandler);
		}
		ResponseEntity<CustomerResponse> cust = new ResponseEntity<CustomerResponse>(response, HttpStatus.OK);
		logger.info("End : get customer details controller : "+custId);
		return cust;
	}
	
	
}


















