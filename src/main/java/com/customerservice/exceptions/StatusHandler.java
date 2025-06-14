package com.customerservice.exceptions;

public class StatusHandler {

	private String statusCode;
	private String message;
	private String errorCode;
	private String errorMessage;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "StatusHandler [statusCode=" + statusCode + ", message=" + message + ", errorCode=" + errorCode
				+ ", errorMessage=" + errorMessage + "]";
	}
	public StatusHandler(String statusCode, String message, String errorCode, String errorMessage) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public StatusHandler() {
		
	}
}
