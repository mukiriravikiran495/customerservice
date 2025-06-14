package com.customerservice.domain;

import java.util.List;
import java.util.Set;

public class VendorDetailsDTO {

	private String vendorId;
	private String v_firstName;
	private String v_lastName;
	private String v_mobile;
	private String v_email;
//	private List<VendorAddressDTO> vendorAddress;
	private VendorAddressDTO vendorAddress;
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getV_firstName() {
		return v_firstName;
	}
	public void setV_firstName(String v_firstName) {
		this.v_firstName = v_firstName;
	}
	public String getV_lastName() {
		return v_lastName;
	}
	public void setV_lastName(String v_lastName) {
		this.v_lastName = v_lastName;
	}
	public String getV_mobile() {
		return v_mobile;
	}
	public void setV_mobile(String v_mobile) {
		this.v_mobile = v_mobile;
	}
	public String getV_email() {
		return v_email;
	}
	public void setV_email(String v_email) {
		this.v_email = v_email;
	}
	public VendorAddressDTO getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(VendorAddressDTO vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	
	
}
