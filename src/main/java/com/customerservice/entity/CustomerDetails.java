package com.customerservice.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy HH:mm:ss.SSS")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(name = "CREATEDBY")
    private long createdBy;
    
	@Column(name = "UPDATEDAT")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy HH:mm:ss.SSS")
    private LocalDateTime updatedAt = LocalDateTime.now();
	
	@Column(name = "UPDATEDBY")
    private long updatedBy;
    
	@Column(name = "PROFILE_IMAGE")
    private String profile_image;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
	
}
