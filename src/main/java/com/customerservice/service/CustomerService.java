package com.customerservice.service;

import java.util.List;

import com.customerservice.domain.CancelResponseDTO;
import com.customerservice.domain.CustomerBookingResponseDTO;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.exceptions.StatusHandler;

public interface CustomerService {

	CustomerResponse createCustomer(CustomerDetailsDTO customerDetailsDTO, CustomerResponse response, StatusHandler statusHandler);

	CustomerResponse getCustomerDetails(Long custId, CustomerResponse response, StatusHandler statusHandler);
	

}
