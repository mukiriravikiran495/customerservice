package com.customerservice.domain;

import com.customerservice.exceptions.StatusHandler;

public class CustomerResponse {

	private CustomerDetailsDTO detailsDTO;
	private StatusHandler statusHandler;
	
	
	public CustomerDetailsDTO getDetailsDTO() {
		return detailsDTO;
	}
	public void setDetailsDTO(CustomerDetailsDTO detailsDTO) {
		this.detailsDTO = detailsDTO;
	}
	public StatusHandler getStatusHandler() {
		return statusHandler;
	}
	public void setStatusHandler(StatusHandler statusHandler) {
		this.statusHandler = statusHandler;
	}
	@Override
	public String toString() {
		return "CustomerResponse [detailsDTO=" + detailsDTO + ", statusHandler=" + statusHandler + "]";
	}
	
	
	
}
