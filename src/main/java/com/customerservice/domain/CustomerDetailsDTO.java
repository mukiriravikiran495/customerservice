package com.customerservice.domain;



public class CustomerDetailsDTO {

	private long custId;
	private String c_firstName;
	private String c_lastName;
	private String c_mobile;
	private String c_email;
	private CustAddressDTO address;
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
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
	
	public CustAddressDTO getAddress() {
		return address;
	}
	public void setAddress(CustAddressDTO address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "CustomerDetailsDTO [custId=" + custId + ", c_firstName=" + c_firstName + ", c_lastName=" + c_lastName
				+ ", c_mobile=" + c_mobile + ", c_email=" + c_email + ", address=" + address + "]";
	}
	public CustomerDetailsDTO() {
		
	}
}
