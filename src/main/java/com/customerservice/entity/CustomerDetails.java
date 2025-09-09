package com.customerservice.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table( name = "CUSTOMER_DETAILS", schema = "CUSTOMER")
public class CustomerDetails implements Serializable{


	@Serial
    private static final long serialVersionUID = 4366299903003325817L;

	@Id
	@Column( name = "CUSTID")
	private long custId;
	
	@Column(name = "CFIRSTNAME")
	private String cFirstname;
	
	@Column(name = "CLASTNAME")
	private String cLastname;
	
	@Column(name = "CMOBILE")
	private String cMobile;
	
	@Column(name = "CEMAIL")
	private String cEmail;
	
	@Column(name = "CADDRESS1")
	private String cAddress1;
	
	@Column(name = "CADDRESS2")
	private String cAddress2;
	
	@Column(name = "CCITY")
	private String cCity;
	
	@Column(name = "CSTATE")
	private String cState;
	
	@Column(name = "CZIPCODE")
	private String cZipcode;
	
	@Column(name = "CPICKUPLATTITUDE")
	private Double cPickupLattitude;
	
	@Column(name = "CPICKUPLONGITUDE")
	private Double cPickupLongitude;
	
	@Column(name = "CREATEDAT")
	@JsonProperty("createdAt")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(name = "CREATEDBY")
    private long createdBy;
    
	@Column(name = "UPDATEDAT")
	@JsonProperty("updatedAt")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime updatedAt = LocalDateTime.now();
	
	@Column(name = "UPDATEDBY")
    private long updatedBy;
    
	@Column(name = "PROFILE_IMAGE")
    private String profile_image;
	
	@Column(name = "CPIMAGE")
	private String cpImage;
	
	@Column(name = "CPIMAGE_URL")
	private String cpImage_url;
	
	@Column(name = "CPIMAGE_FILENAME")
	private String cpImage_filename;
	
	@Column(name = "CPIMAGE_FILEEXTENSION")
	private String cpImage_file_extension;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", cFirstname=" + cFirstname + ", cLastname=" + cLastname
				+ ", cMobile=" + cMobile + ", cEmail=" + cEmail + ", cAddress1=" + cAddress1 + ", cCity=" + cCity
				+ ", cState=" + cState + ", cZipcode=" + cZipcode + ", cPickupLattitude=" + cPickupLattitude
				+ ", cPickupLongitude=" + cPickupLongitude + ", createdAt=" + createdAt + ", createdBy=" + createdBy
				+ ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + ", profile_image=" + profile_image
				+ ", cpImage=" + cpImage + ", cpImage_url=" + cpImage_url + ", cpImage_filename=" + cpImage_filename
				+ ", cpImage_file_extension=" + cpImage_file_extension + "]";
	}
   
	
}
