package com.customerservice.service;

import java.util.List;

import com.customerservice.domain.CancelResponseDTO;
import com.customerservice.domain.CustomerBookingResponseDTO;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.exceptions.StatusHandler;

import jakarta.servlet.http.HttpServletRequest;

public interface CustomerService {

	CustomerResponse createCustomer(CustomerDetailsDTO customerDetailsDTO, HttpServletRequest request, CustomerResponse response, StatusHandler statusHandler);

	CustomerResponse getCustomerDetails(Long custId, String token, CustomerResponse response, StatusHandler statusHandler);

	CustomerResponse updateCustomer(CustomerDetailsDTO customerDetailsDTO, CustomerResponse response,
			StatusHandler statusHandler);
	

}
