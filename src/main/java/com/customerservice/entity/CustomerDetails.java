package com.customerservice.entity;

import java.io.Serial;
import java.io.Serializable;

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
	private long custId;
	
	
	private String c_firstName;
	
	private String c_lastName;
	
	private String c_mobile;
	
	private String c_email;
	
	@OneToOne(mappedBy = "cust", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private CustAddress custAddress;

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

	
	public CustAddress getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(CustAddress custAddress) {
		this.custAddress = custAddress;
	}

	
	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", c_firstName=" + c_firstName + ", c_lastName=" + c_lastName
				+ ", c_mobile=" + c_mobile + ", c_email=" + c_email + ", custAddress=" + custAddress + "]";
	}

	public CustomerDetails() {
		
	}
	
}
