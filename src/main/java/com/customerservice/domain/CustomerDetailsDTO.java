package com.customerservice.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerDetailsDTO {

	private Long custId;
    private String cFirstname;
	private String cLastname;
	private String cMobile;
	private String cEmail;
	private String cAddress1;
	private String cCity;
	private String cState;
	private String cZipcode;
	private Double cPickupLattitude;
	private Double cPickupLongitude;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy HH:mm:ss.SSS")
	private LocalDateTime createdAt = LocalDateTime.now();
    private long createdBy;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy HH:mm:ss.SSS")
	private LocalDateTime updatedAt = LocalDateTime.now();
    private long updatedBy;
    
	
	@Override
	public String toString() {
		return "CustomerDetailsDTO [custId=" + custId + ", cFirstname=" + cFirstname + ", cLastname=" + cLastname
				+ ", cMobile=" + cMobile + ", cEmail=" + cEmail + ", cAddress1=" + cAddress1 + ", cCity=" + cCity
				+ ", cState=" + cState + ", cZipcode=" + cZipcode + ", cPickupLattitude=" + cPickupLattitude
				+ ", cPickupLongitude=" + cPickupLongitude + "]";
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public long getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}


	public Double getcPickupLattitude() {
		return cPickupLattitude;
	}


	public Double getcPickupLongitude() {
		return cPickupLongitude;
	}


	public void setcPickupLattitude(Double cPickupLattitude) {
		this.cPickupLattitude = cPickupLattitude;
	}


	public void setcPickupLongitude(Double cPickupLongitude) {
		this.cPickupLongitude = cPickupLongitude;
	}


	public Long getCustId() {
		return custId;
	}


	public void setCustId(Long custId) {
		this.custId = custId;
	}


	public String getcFirstname() {
		return cFirstname;
	}


	public void setcFirstname(String cFirstname) {
		this.cFirstname = cFirstname;
	}


	public String getcLastname() {
		return cLastname;
	}


	public void setcLastname(String cLastname) {
		this.cLastname = cLastname;
	}


	public String getcMobile() {
		return cMobile;
	}


	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}


	public String getcEmail() {
		return cEmail;
	}


	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}


	public String getcAddress1() {
		return cAddress1;
	}


	public void setcAddress1(String cAddress1) {
		this.cAddress1 = cAddress1;
	}


	public String getcCity() {
		return cCity;
	}


	public void setcCity(String cCity) {
		this.cCity = cCity;
	}


	public String getcState() {
		return cState;
	}


	public void setcState(String cState) {
		this.cState = cState;
	}


	public String getcZipcode() {
		return cZipcode;
	}


	public void setcZipcode(String cZipcode) {
		this.cZipcode = cZipcode;
	}

	public CustomerDetailsDTO() {
		
	}
}
