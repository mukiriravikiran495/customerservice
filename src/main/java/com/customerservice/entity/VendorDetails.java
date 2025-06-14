package com.customerservice.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "VENDOR_DETAILS", schema = "VENDOR")
public class VendorDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column( name = "vendorId")
	private long vendorId;
	private String v_firstName;
	private String v_lastName;
	private String v_mobile;
	private String v_email;
	
	@OneToOne(mappedBy = "vendorDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
    private VendorAddress vendorAddress;
	

	@OneToMany(mappedBy = "vendorDetails", cascade = CascadeType.ALL)
	@JsonIgnore
    private List<MyBookings> bookings;
	public List<MyBookings> getBookings() {
		return bookings;
	}
	public void setBookings(List<MyBookings> bookings) {
		this.bookings = bookings;
	}
	
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
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
	
	public VendorDetails(long vendorId, String v_firstName, String v_lastName, String v_mobile, String v_email,
			VendorAddress vendorAddress, List<MyBookings> bookings) {
		super();
		this.vendorId = vendorId;
		this.v_firstName = v_firstName;
		this.v_lastName = v_lastName;
		this.v_mobile = v_mobile;
		this.v_email = v_email;
		this.vendorAddress = vendorAddress;
		this.bookings = bookings;
	}
	@Override
	public String toString() {
		return "VendorDetails [vendorId=" + vendorId + ", v_firstName=" + v_firstName + ", v_lastName=" + v_lastName
				+ ", v_mobile=" + v_mobile + ", v_email=" + v_email + ", vendorAddress=" + vendorAddress + ", bookings="
				+ bookings + "]";
	}
	public VendorDetails() {
		
	}
	
	public VendorAddress getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(VendorAddress vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
