package com.customerservice.domain;

import java.time.LocalDateTime;

public class TokenResponse {
	private String accessToken;   // JWT string
    private String tokenUuid;     // UUID of DB row (cust_tokens table)
    private String correlationId; // same as JWT "jti"
    private String tokenType = "Bearer";
    private LocalDateTime issuedAt;
    private LocalDateTime expiresAt;
	
	public TokenResponse(String accessToken, String tokenUuid, String correlationId, String tokenType,
			LocalDateTime issuedAt, LocalDateTime expiresAt) {
		super();
		this.accessToken = accessToken;
		this.tokenUuid = tokenUuid;
		this.correlationId = correlationId;
		this.tokenType = tokenType;
		this.issuedAt = issuedAt;
		this.expiresAt = expiresAt;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenUuid() {
		return tokenUuid;
	}

	public void setTokenUuid(String tokenUuid) {
		this.tokenUuid = tokenUuid;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
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

	public TokenResponse() {
		super();
	}
	
    
}