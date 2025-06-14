package com.customerservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "BOOKINGS", schema = "MYBOOKINGS")
public class MyBookings implements Serializable{

	@Id
	@Column( name = "bookingId")
	@GeneratedValue( strategy = GenerationType.AUTO)
	private long bookingId;
	
	private String status;
	private LocalDateTime BOOKING_DATE; 
	private String SCHEDULED_DATE;
	private String PICKUP_TIME_SLOT; 
	private String DELIVERY_DATE;
	private String SERVICE_TYPE;
	private BigInteger ITEM_COUNT;   
	private BigDecimal  ESTIMATED_WEIGHT;  
	private BigDecimal  ESTIMATED_COST; 
	private BigDecimal  DISCOUNT_AMOUNT;  
	private BigDecimal  FINAL_COST; 
	private String PAYMENT_STATUS ; 
	private String PAYMENT_MODE;  
	private String TRANSACTION_ID;
	private String BOOKING_STATUS;  
	private String VEHICLE_NUMBER; 
	private String TRACKING_URL;
	private String OTP_FOR_DELIVERY;  
	private String CREATED_AT;  
	private String CREATED_BY; 
	private String UPDATED_AT;  
	private String UPDATED_BY;
	
	@ManyToOne
    @JoinColumn(name = "custId")
    private CustomerDetails customerDetails;
	
	

    @ManyToOne
    @JoinColumn(name = "vendorId")
    private VendorDetails vendorDetails;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getBOOKING_DATE() {
		return BOOKING_DATE;
	}

	public void setBOOKING_DATE(LocalDateTime bOOKING_DATE) {
		BOOKING_DATE = bOOKING_DATE;
	}

	public String getSCHEDULED_DATE() {
		return SCHEDULED_DATE;
	}

	public void setSCHEDULED_DATE(String sCHEDULED_DATE) {
		SCHEDULED_DATE = sCHEDULED_DATE;
	}

	public String getPICKUP_TIME_SLOT() {
		return PICKUP_TIME_SLOT;
	}

	public void setPICKUP_TIME_SLOT(String pICKUP_TIME_SLOT) {
		PICKUP_TIME_SLOT = pICKUP_TIME_SLOT;
	}

	public String getSERVICE_TYPE() {
		return SERVICE_TYPE;
	}

	public void setSERVICE_TYPE(String sERVICE_TYPE) {
		SERVICE_TYPE = sERVICE_TYPE;
	}

	public BigInteger getITEM_COUNT() {
		return ITEM_COUNT;
	}

	public void setITEM_COUNT(BigInteger iTEM_COUNT) {
		ITEM_COUNT = iTEM_COUNT;
	}

	public BigDecimal getESTIMATED_WEIGHT() {
		return ESTIMATED_WEIGHT;
	}

	public void setESTIMATED_WEIGHT(BigDecimal eSTIMATED_WEIGHT) {
		ESTIMATED_WEIGHT = eSTIMATED_WEIGHT;
	}

	public BigDecimal getESTIMATED_COST() {
		return ESTIMATED_COST;
	}

	public void setESTIMATED_COST(BigDecimal eSTIMATED_COST) {
		ESTIMATED_COST = eSTIMATED_COST;
	}

	public BigDecimal getDISCOUNT_AMOUNT() {
		return DISCOUNT_AMOUNT;
	}

	public void setDISCOUNT_AMOUNT(BigDecimal dISCOUNT_AMOUNT) {
		DISCOUNT_AMOUNT = dISCOUNT_AMOUNT;
	}

	public BigDecimal getFINAL_COST() {
		return FINAL_COST;
	}

	public void setFINAL_COST(BigDecimal fINAL_COST) {
		FINAL_COST = fINAL_COST;
	}

	public String getPAYMENT_STATUS() {
		return PAYMENT_STATUS;
	}

	public void setPAYMENT_STATUS(String pAYMENT_STATUS) {
		PAYMENT_STATUS = pAYMENT_STATUS;
	}

	public String getPAYMENT_MODE() {
		return PAYMENT_MODE;
	}

	public void setPAYMENT_MODE(String pAYMENT_MODE) {
		PAYMENT_MODE = pAYMENT_MODE;
	}

	public String getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}

	public void setTRANSACTION_ID(String tRANSACTION_ID) {
		TRANSACTION_ID = tRANSACTION_ID;
	}

	public String getBOOKING_STATUS() {
		return BOOKING_STATUS;
	}

	public void setBOOKING_STATUS(String bOOKING_STATUS) {
		BOOKING_STATUS = bOOKING_STATUS;
	}

	public String getVEHICLE_NUMBER() {
		return VEHICLE_NUMBER;
	}

	public void setVEHICLE_NUMBER(String vEHICLE_NUMBER) {
		VEHICLE_NUMBER = vEHICLE_NUMBER;
	}

	public String getTRACKING_URL() {
		return TRACKING_URL;
	}

	public void setTRACKING_URL(String tRACKING_URL) {
		TRACKING_URL = tRACKING_URL;
	}

	public String getOTP_FOR_DELIVERY() {
		return OTP_FOR_DELIVERY;
	}

	public void setOTP_FOR_DELIVERY(String oTP_FOR_DELIVERY) {
		OTP_FOR_DELIVERY = oTP_FOR_DELIVERY;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	public void setUPDATED_BY(String uPDATED_BY) {
		UPDATED_BY = uPDATED_BY;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public VendorDetails getVendorDetails() {
		return vendorDetails;
	}

	public void setVendorDetails(VendorDetails vendorDetails) {
		this.vendorDetails = vendorDetails;
	}

	public MyBookings() {
		super();
	}

	

	public String getDELIVERY_DATE() {
		return DELIVERY_DATE;
	}

	public void setDELIVERY_DATE(String dELIVERY_DATE) {
		DELIVERY_DATE = dELIVERY_DATE;
	}

	public String getCREATED_AT() {
		return CREATED_AT;
	}

	public void setCREATED_AT(String cREATED_AT) {
		CREATED_AT = cREATED_AT;
	}

	public String getUPDATED_AT() {
		return UPDATED_AT;
	}

	public void setUPDATED_AT(String uPDATED_AT) {
		UPDATED_AT = uPDATED_AT;
	}

	@Override
	public String toString() {
		return "MyBookings [bookingId=" + bookingId + ", status=" + status + ", BOOKING_DATE=" + BOOKING_DATE
				+ ", SCHEDULED_DATE=" + SCHEDULED_DATE + ", PICKUP_TIME_SLOT=" + PICKUP_TIME_SLOT + ", DELIVERY_DATE="
				+ DELIVERY_DATE + ", SERVICE_TYPE=" + SERVICE_TYPE + ", ITEM_COUNT=" + ITEM_COUNT
				+ ", ESTIMATED_WEIGHT=" + ESTIMATED_WEIGHT + ", ESTIMATED_COST=" + ESTIMATED_COST + ", DISCOUNT_AMOUNT="
				+ DISCOUNT_AMOUNT + ", FINAL_COST=" + FINAL_COST + ", PAYMENT_STATUS=" + PAYMENT_STATUS
				+ ", PAYMENT_MODE=" + PAYMENT_MODE + ", TRANSACTION_ID=" + TRANSACTION_ID + ", BOOKING_STATUS="
				+ BOOKING_STATUS + ", VEHICLE_NUMBER=" + VEHICLE_NUMBER + ", TRACKING_URL=" + TRACKING_URL
				+ ", OTP_FOR_DELIVERY=" + OTP_FOR_DELIVERY + ", CREATED_AT=" + CREATED_AT + ", CREATED_BY=" + CREATED_BY
				+ ", UPDATED_AT=" + UPDATED_AT + ", UPDATED_BY=" + UPDATED_BY + ", customerDetails=" + customerDetails
				+ ", vendorDetails=" + vendorDetails + "]";
	}

	public MyBookings(long bookingId, String status, LocalDateTime bOOKING_DATE, String sCHEDULED_DATE,
			String pICKUP_TIME_SLOT, String dELIVERY_DATE, String sERVICE_TYPE, BigInteger iTEM_COUNT,
			BigDecimal eSTIMATED_WEIGHT, BigDecimal eSTIMATED_COST, BigDecimal dISCOUNT_AMOUNT, BigDecimal fINAL_COST,
			String pAYMENT_STATUS, String pAYMENT_MODE, String tRANSACTION_ID, String bOOKING_STATUS,
			String vEHICLE_NUMBER, String tRACKING_URL, String oTP_FOR_DELIVERY, String cREATED_AT, String cREATED_BY,
			String uPDATED_AT, String uPDATED_BY, CustomerDetails customerDetails, VendorDetails vendorDetails) {
		super();
		this.bookingId = bookingId;
		this.status = status;
		BOOKING_DATE = bOOKING_DATE;
		SCHEDULED_DATE = sCHEDULED_DATE;
		PICKUP_TIME_SLOT = pICKUP_TIME_SLOT;
		DELIVERY_DATE = dELIVERY_DATE;
		SERVICE_TYPE = sERVICE_TYPE;
		ITEM_COUNT = iTEM_COUNT;
		ESTIMATED_WEIGHT = eSTIMATED_WEIGHT;
		ESTIMATED_COST = eSTIMATED_COST;
		DISCOUNT_AMOUNT = dISCOUNT_AMOUNT;
		FINAL_COST = fINAL_COST;
		PAYMENT_STATUS = pAYMENT_STATUS;
		PAYMENT_MODE = pAYMENT_MODE;
		TRANSACTION_ID = tRANSACTION_ID;
		BOOKING_STATUS = bOOKING_STATUS;
		VEHICLE_NUMBER = vEHICLE_NUMBER;
		TRACKING_URL = tRACKING_URL;
		OTP_FOR_DELIVERY = oTP_FOR_DELIVERY;
		CREATED_AT = cREATED_AT;
		CREATED_BY = cREATED_BY;
		UPDATED_AT = uPDATED_AT;
		UPDATED_BY = uPDATED_BY;
		this.customerDetails = customerDetails;
		this.vendorDetails = vendorDetails;
	}
	
	

	
}
