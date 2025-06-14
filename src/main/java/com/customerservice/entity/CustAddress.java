package com.customerservice.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "CUST_ADDRESS", schema = "CUSTOMER")
public class CustAddress {

	@Id
	private long c_address_id;
	
	private String c_address1;
	
	private String c_city;
	
	private String c_state;
	
	private String c_zipcode;
	
	@OneToOne
    @JoinColumn(name = "custId") // FK in CUST_ADDRESS table
    private CustomerDetails cust;

	public CustAddress() {
		
	}

	

	public long getC_address_id() {
		return c_address_id;
	}



	public void setC_address_id(long c_address_id) {
		this.c_address_id = c_address_id;
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

	public CustomerDetails getCust() {
		return cust;
	}

	public void setCust(CustomerDetails cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "CustAddress [c_address_id=" + c_address_id + ", c_address1=" + c_address1 + ", c_city=" + c_city
				+ ", c_state=" + c_state + ", c_zipcode=" + c_zipcode + ", cust=" + cust + "]";
	}

	public CustAddress(long c_address_id, String c_address1, String c_city, String c_state, String c_zipcode,
			CustomerDetails cust) {
		super();
		this.c_address_id = c_address_id;
		this.c_address1 = c_address1;
		this.c_city = c_city;
		this.c_state = c_state;
		this.c_zipcode = c_zipcode;
		this.cust = cust;
	}
	
}
