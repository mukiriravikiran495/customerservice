package com.customerservice.domain;


public class CustAddressDTO {

	private String c_address_Id;
    private String c_address1;
    private String c_city;
    private String c_state;
    private String c_zipcode;
    
	public String getC_address_Id() {
		return c_address_Id;
	}
	public void setC_address_Id(String c_address_Id) {
		this.c_address_Id = c_address_Id;
	}
	public String getC_address1() {
		return c_address1;
	}
	public void setC_address1(String c_address1) {
		this.c_address1 = c_address1;
	}
	public String getC_city() {
		return c_city;
	}
	public void setC_city(String c_city) {
		this.c_city = c_city;
	}
	public String getC_state() {
		return c_state;
	}
	public void setC_state(String c_state) {
		this.c_state = c_state;
	}
	public String getC_zipcode() {
		return c_zipcode;
	}
	public void setC_zipcode(String c_zipcode) {
		this.c_zipcode = c_zipcode;
	}
	@Override
	public String toString() {
		return "CustAddressDTO [c_address_Id=" + c_address_Id + ", c_address1=" + c_address1 + ", c_city=" + c_city
				+ ", c_state=" + c_state + ", c_zipcode=" + c_zipcode + "]";
	}
	
	public CustAddressDTO() {
		
	}
	
	public CustAddressDTO(String c_address_Id, String c_address1, String c_city, String c_state, String c_zipcode) {
		super();
		this.c_address_Id = c_address_Id;
		this.c_address1 = c_address1;
		this.c_city = c_city;
		this.c_state = c_state;
		this.c_zipcode = c_zipcode;
	}
	
	
}
