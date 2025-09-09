package com.customerservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "CUST_TOKENS")
public class CustomerTokens {

    @Id
    @Column(name = "TOKENUUID", nullable = false, length = 255)
    private String tokenUuid;

    @Column(name = "CUSTID")
    private Long custId;

    @Column(name = "MOBILE", length = 255)
    private String mobile;

    @Column(name = "ACCESSTOKEN", nullable = false, length = 255)
    private String accessToken;

    @Column(name = "ISSUEDAT")
    @JsonProperty("issuedAt")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime issuedAt;

    @Column(name = "EXPIRESAT")
    @JsonProperty("expiresAt")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime expiresAt;

    @Column(name = "ISACTIVE", length = 1)
    private String isActive;

    @Column(name = "DEVICEID", length = 255)
    private String deviceId;

    @Column(name = "DEVICENAME", length = 255)
    private String deviceName;

    @Column(name = "APPID", length = 50)
    private String appId;

    @Column(name = "CORRELATIONID", length = 255)
    private String correlationId;

    // Constructors
    public CustomerTokens() {}

    public CustomerTokens(String tokenUuid, Long custId, String mobile, String accessToken, 
                     LocalDateTime issuedAt, LocalDateTime expiresAt, String isActive,
                     String deviceId, String deviceName, String appId, String correlationId) {
        this.tokenUuid = tokenUuid;
        this.custId = custId;
        this.mobile = mobile;
        this.accessToken = accessToken;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
        this.isActive = isActive;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.appId = appId;
        this.correlationId = correlationId;
    }

    @Override
	public String toString() {
		return "CustomerTokens [tokenUuid=" + tokenUuid + ", custId=" + custId + ", mobile=" + mobile + ", accessToken="
				+ accessToken + ", issuedAt=" + issuedAt + ", expiresAt=" + expiresAt + ", isActive=" + isActive
				+ ", deviceId=" + deviceId + ", deviceName=" + deviceName + ", appId=" + appId + ", correlationId="
				+ correlationId + "]";
	}

	// Getters and Setters
    public String getTokenUuid() {
        return tokenUuid;
    }

    public void setTokenUuid(String tokenUuid) {
        this.tokenUuid = tokenUuid;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
}
