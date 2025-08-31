package com.customerservice.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_tokens")   // table name in DB
public class CustomerTokens {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_token_seq")
    @SequenceGenerator(name = "customer_token_seq", sequenceName = "CUSTOMER_TOKEN_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CUSTID", nullable = false)
    private Long custId;   // reference to customer_details.cust_id

    @Column(name = "TOKENID", nullable = false, length = 255, unique = true)
    private String tokenId;

    @Column(name = "ISSUEDAT")
    private LocalDateTime issuedAt;

    @Column(name = "EXPIRESAT")
    private LocalDateTime expiresAt;

    @Column(name = "ISACTIVE", length = 1)
    private String isActive;   // 'Y' or 'N'

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public LocalDateTime getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(LocalDateTime issuedAt) {
		this.issuedAt = issuedAt;
	}

	public LocalDateTime getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(LocalDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
    
}
