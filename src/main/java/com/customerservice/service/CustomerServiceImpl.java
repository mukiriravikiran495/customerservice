package com.customerservice.service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.constants.AppConstants;
import com.customerservice.domain.CancelResponseDTO;
import com.customerservice.domain.CustomerBookingResponseDTO;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.entity.CustomerDetails;
import com.customerservice.entity.MyBookings;
import com.customerservice.exceptions.StatusHandler;
import com.customerservice.mapper.CustomerBookingsMapper;
import com.customerservice.repository.CustomerBookingsRepository;
import com.customerservice.repository.CustomerServiceRepository;


@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService{
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private final CustomerBookingsMapper customerMapper;
	private final CustomerBookingsRepository custRepository;
	
	private final CustomerServiceRepository repository;
	
	@Autowired
	public CustomerServiceImpl( CustomerServiceRepository repository, CustomerBookingsRepository custRepository, CustomerBookingsMapper customerMapper ) {
		this.repository = repository;
		this.custRepository = custRepository;
		this.customerMapper = customerMapper;
	}

	@Override
	public CustomerResponse createCustomer(CustomerDetailsDTO customerDetailsDTO, CustomerResponse response,
			StatusHandler statusHandler) {
		System.out.println(customerDetailsDTO.getCustId());
		CustomerDetails custDetails = repository.findByCustId(customerDetailsDTO.getCustId());
		
		custDetails.setcFirstname(customerDetailsDTO.getcFirstname());
		repository.save(custDetails);
		statusHandler.setMessage("Inserted ..!!");
		response.setStatusHandler(statusHandler);
		return response;
	}

	@Override
	public CustomerResponse getCustomerDetails(Long custId, CustomerResponse response, StatusHandler statusHandler) {
		logger.info("Start : get customer details service : "+custId);
		try {
			CustomerDetails details = repository.findByCustId(custId);
			if( null == details ) {
				throw new RuntimeException("CustId you are passing doesn't exists : "+custId);
			}
			CustomerDetailsDTO cust = customerMapper.toDTO(details);
			response.setDetailsDTO(cust);
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
	
	

}
