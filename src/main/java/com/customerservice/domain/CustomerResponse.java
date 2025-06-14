package com.customerservice.domain;

import com.customerservice.exceptions.StatusHandler;

public class CustomerResponse {

	private String custId;
	private String c_firstName;
	private String c_lastName;
	private String c_mobile;
	private String c_email;
	private StatusHandler statusHandler;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getC_firstName() {
		return c_firstName;
	}
	public void setC_firstName(String c_firstName) {
		this.c_firstName = c_firstName;
	}
	public String getC_lastName() {
		return c_lastName;
	}
	public void setC_lastName(String c_lastName) {
		this.c_lastName = c_lastName;
	}
	public String getC_mobile() {
		return c_mobile;
	}
	public void setC_mobile(String c_mobile) {
		this.c_mobile = c_mobile;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public StatusHandler getStatusHandler() {
		return statusHandler;
	}
	public void setStatusHandler(StatusHandler statusHandler) {
		this.statusHandler = statusHandler;
	}
	
}
