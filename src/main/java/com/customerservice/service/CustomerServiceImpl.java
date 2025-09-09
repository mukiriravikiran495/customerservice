package com.customerservice.service;

import java.lang.invoke.MethodHandles;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.constants.AppConstants;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.entity.CustomerDetails;
import com.customerservice.entity.CustomerTokens;
import com.customerservice.exceptions.StatusHandler;
import com.customerservice.mapper.CustomerBookingsMapper;
import com.customerservice.repository.CustomerBookingsRepository;
import com.customerservice.repository.CustomerServiceRepository;
import com.customerservice.utils.CustomerUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService{
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private final CustomerBookingsMapper customerMapper;
	private final CustomerBookingsRepository custRepository;
	private final CustomerServiceRepository repository;
	@Autowired
    private ObjectMapper objectMapper;
	
	@Autowired
	CustomerUtils customerUtils;
	
	@Autowired
	public CustomerServiceImpl( CustomerServiceRepository repository, CustomerBookingsRepository custRepository, 
			CustomerBookingsMapper customerMapper ) {
		this.repository = repository;
		this.custRepository = custRepository;
		this.customerMapper = customerMapper;
	}

	@Override
	public CustomerResponse createCustomer(CustomerDetailsDTO customerDetailsDTO, HttpServletRequest request, CustomerResponse response,
			StatusHandler statusHandler) {
		logger.info("Start : create customer service : ");
		
		try {
			System.out.println(customerDetailsDTO.getCustId());
			CustomerDetails details = new CustomerDetails();
			details.setCustId(customerDetailsDTO.getCustId());
			details.setcMobile(customerDetailsDTO.getcMobile());
			details.setCreatedBy(customerDetailsDTO.getCustId());
			CustomerDetails saved =  repository.save(details);
			
			
			CustomerDetailsDTO newDto = customerMapper.toDTO(saved);
			response.setCustomerDetailsDTO(newDto);
			statusHandler.setStatusCode("200");
			statusHandler.setMessage(AppConstants.SUCCESS);
			response.setStatusHandler(statusHandler);
			System.out.println(response);
		}catch(Exception ex){
			statusHandler.setStatusCode("500");
			statusHandler.setMessage(ex.getMessage());
			response.setStatusHandler(statusHandler);
		}
		logger.info("End : create customer service : ");
		return response;
	}

	@Override
	public CustomerResponse getCustomerDetails(Long custId, String token, CustomerResponse response, StatusHandler statusHandler) {
		logger.info("Start : get customer details service : "+custId);
		try {
			CustomerTokens custTokens = customerUtils.validateAccessToken(token);
			System.out.println(custTokens);
			
			CustomerDetails details = repository.findByCustId(custId);
			System.out.println(details);
			if( null == details ) {
				throw new RuntimeException("CustId you are passing doesn't exists : "+custId);
			}
			CustomerDetailsDTO cust = customerMapper.toDTO(details);
			response.setCustomerDetailsDTO(cust);
		}catch(RuntimeException ex) {
			statusHandler.setErrorCode("400");
			statusHandler.setErrorMessage(ex.getMessage());
			response.setStatusHandler(statusHandler);
		}catch(Exception ex) {
			statusHandler.setErrorCode("500");
			statusHandler.setErrorMessage(ex.getMessage());
			response.setStatusHandler(statusHandler);
		}
		
		
		logger.info("End : get customer details service : "+custId);
		return response;
	}

	@Override
	public CustomerResponse updateCustomer(CustomerDetailsDTO customerDetailsDTO, CustomerResponse response,
			StatusHandler statusHandler) {
		logger.info("Start : update customer service : ");
		
		CustomerDetails custDetails =  repository.findByCustId(customerDetailsDTO.getCustId());
		Optional.ofNullable(custDetails).orElseThrow(() -> new RuntimeException(AppConstants.CUSTID_DOES_NOT_EXISTS));
		custDetails.setcAddress1(customerDetailsDTO.getcAddress1());
		custDetails.setcCity(customerDetailsDTO.getcCity());
		custDetails.setcFirstname(customerDetailsDTO.getcFirstname());
		custDetails.setcState(customerDetailsDTO.getcState());
		custDetails.setcZipcode(customerDetailsDTO.getcZipcode());
		custDetails.setcPickupLattitude(customerDetailsDTO.getcPickupLattitude());
		custDetails.setcPickupLongitude(customerDetailsDTO.getcPickupLongitude());
		CustomerDetails savedDetails = repository.save(custDetails);
		Optional.ofNullable(savedDetails).orElseThrow(() -> new RuntimeException(AppConstants.CUSTOMER_DETAILS_NOT_SAVED));
		CustomerDetailsDTO newDto = customerMapper.toDTO(savedDetails);
		response.setCustomerDetailsDTO(newDto);
		logger.info("End : update customer service : ");
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
