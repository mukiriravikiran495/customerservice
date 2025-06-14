package com.customerservice.domain;

public class VendorAddressDTO {
	
	private String v_address_Id;
    private String v_address1;
    private String v_city;
    private String v_state;
    private String v_zipcode;
	public String getV_address_Id() {
		return v_address_Id;
	}
	public void setV_address_Id(String v_address_Id) {
		this.v_address_Id = v_address_Id;
	}
	public String getV_address1() {
		return v_address1;
	}
	public void setV_address1(String v_address1) {
		this.v_address1 = v_address1;
	}
	public String getV_city() {
		return v_city;
	}
	public void setV_city(String v_city) {
		this.v_city = v_city;
	}
	public String getV_state() {
		return v_state;
	}
	public void setV_state(String v_state) {
		this.v_state = v_state;
	}
	public String getV_zipcode() {
		return v_zipcode;
	}
	public void setV_zipcode(String v_zipcode) {
		this.v_zipcode = v_zipcode;
	}
	public VendorAddressDTO(String v_address_Id, String v_address1, String v_city, String v_state, String v_zipcode) {
		super();
		this.v_address_Id = v_address_Id;
		this.v_address1 = v_address1;
		this.v_city = v_city;
		this.v_state = v_state;
		this.v_zipcode = v_zipcode;
	}
    
    public VendorAddressDTO() {
    	
    }
	@Override
	public String toString() {
		return "VendorAddressDTO [v_address_Id=" + v_address_Id + ", v_address1=" + v_address1 + ", v_city=" + v_city
				+ ", v_state=" + v_state + ", v_zipcode=" + v_zipcode + "]";
	}
    

}
