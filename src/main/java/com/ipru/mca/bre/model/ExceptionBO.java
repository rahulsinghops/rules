package com.ipru.mca.bre.model;

import java.util.Date;

public class ExceptionBO {
	private Date timestamp;
	private String message;
	private String responseCode;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public ExceptionBO(Date timestamp, String message, String responseCode) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.responseCode = responseCode;
	}
	public ExceptionBO() {
		super();
	}
	@Override
	public String toString() {
		return "ExceptionBO [timestamp=" + timestamp + ", message=" + message + ", responseCode=" + responseCode + "]";
	}
	
	

}
