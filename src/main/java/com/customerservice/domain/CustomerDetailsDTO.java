package com.customerservice.domain;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class CustomerDetailsDTO {

	private long custId;
	private String cFirstname;
	private String cLastname;
	private String cMobile;
	private String cEmail;
	private String cAddress1;
	private String cAddress2;
	private String cCity;
	private String cState;
	private String cZipcode;
	private Double cPickupLattitude;
	private Double cPickupLongitude;
	private LocalDateTime createdAt = LocalDateTime.now();
    private long createdBy;
    private LocalDateTime updatedAt = LocalDateTime.now();
    private long updatedBy;
    private String profile_image;
	private String cpImage;
	private String cpImage_url;
	private String cpImage_filename;
	private String cpImage_file_extension;
	
	public CustomerDetailsDTO() {
		
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
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

	public String getcAddress2() {
		return cAddress2;
	}

	public void setcAddress2(String cAddress2) {
		this.cAddress2 = cAddress2;
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

	public Double getcPickupLattitude() {
		return cPickupLattitude;
	}

	public void setcPickupLattitude(Double cPickupLattitude) {
		this.cPickupLattitude = cPickupLattitude;
	}

	public Double getcPickupLongitude() {
		return cPickupLongitude;
	}

	public void setcPickupLongitude(Double cPickupLongitude) {
		this.cPickupLongitude = cPickupLongitude;
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

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	public String getCpImage() {
		return cpImage;
	}

	public void setCpImage(String cpImage) {
		this.cpImage = cpImage;
	}

	public String getCpImage_url() {
		return cpImage_url;
	}

	public void setCpImage_url(String cpImage_url) {
		this.cpImage_url = cpImage_url;
	}

	public String getCpImage_filename() {
		return cpImage_filename;
	}

	public void setCpImage_filename(String cpImage_filename) {
		this.cpImage_filename = cpImage_filename;
	}

	public String getCpImage_file_extension() {
		return cpImage_file_extension;
	}

	public void setCpImage_file_extension(String cpImage_file_extension) {
		this.cpImage_file_extension = cpImage_file_extension;
	}

	@Override
	public String toString() {
		return "CustomerDetailsDTO [custId=" + custId + ", cFirstname=" + cFirstname + ", cLastname=" + cLastname
				+ ", cMobile=" + cMobile + ", cEmail=" + cEmail + ", cAddress1=" + cAddress1 + ", cCity=" + cCity
				+ ", cState=" + cState + ", cZipcode=" + cZipcode + ", cPickupLattitude=" + cPickupLattitude
				+ ", cPickupLongitude=" + cPickupLongitude + ", createdAt=" + createdAt + ", createdBy=" + createdBy
				+ ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + ", profile_image=" + profile_image
				+ ", cpImage=" + cpImage + ", cpImage_url=" + cpImage_url + ", cpImage_filename=" + cpImage_filename
				+ ", cpImage_file_extension=" + cpImage_file_extension + "]";
	}
	
}
