package com.customerservice.domain;

import com.customerservice.exceptions.StatusHandler;

public class CustomerResponse {

	private CustomerDetailsDTO customerDetailsDTO;
	private StatusHandler statusHandler;
	public CustomerDetailsDTO getCustomerDetailsDTO() {
		return customerDetailsDTO;
	}
	public void setCustomerDetailsDTO(CustomerDetailsDTO customerDetailsDTO) {
		this.customerDetailsDTO = customerDetailsDTO;
	}
	public StatusHandler getStatusHandler() {
		return statusHandler;
	}
	public void setStatusHandler(StatusHandler statusHandler) {
		this.statusHandler = statusHandler;
	}
	@Override
	public String toString() {
		return "CustomerResponse [customerDetailsDTO=" + customerDetailsDTO + ", statusHandler=" + statusHandler + "]";
	}
	
	
}
