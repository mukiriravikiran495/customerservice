package com.customerservice.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table( name = "CUSTOMER_DETAILS", schema = "CUSTOMER")
public class CustomerDetails implements Serializable{


    @Serial
    private static final long serialVersionUID = 4366299903003325817L;
    
	@Id
	@Column( name = "custId")
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
	private LocalDateTime createdAt = LocalDateTime.now();
    private String createdBy; 
	
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getcFirstname() {
		return cFirstname;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
