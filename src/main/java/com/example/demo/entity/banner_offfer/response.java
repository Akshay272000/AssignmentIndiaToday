 package com.example.demo.entity.banner_offfer;

import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.entity.horoscope_json.allHoroscope;

public class response {

	
	private String httpStatus;
	private String httpStatusCode;
	private String success;
	private String message;
	private String apiName;
//	@OneToMany
	private List<banner_offer> data;
//	private banner_offer data;
//	private List<allHoroscope> data1;
	
	
//	private banner_offer data;
	public String getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getHttpStatusCode() {
		return httpStatusCode;
	}
	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public List<banner_offer> getData1() {
		return data;
	}
	public void setData1(List<banner_offer> data1) {
		this.data = data1;
	}
	public response(String httpStatus, String httpStatusCode, String success, String message, String apiName,
			List<banner_offer> data1) {
		super();
		this.httpStatus = httpStatus;
		this.httpStatusCode = httpStatusCode;
		this.success = success;
		this.message = message;
		this.apiName = apiName;
		this.data = data1;
	}
	public response() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "response [httpStatus=" + httpStatus + ", httpStatusCode=" + httpStatusCode + ", success=" + success
				+ ", message=" + message + ", apiName=" + apiName + ", data1=" + data+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	



}
