 package com.example.demo.entity.horoscope_json;

import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.entity.horoscope_json.allHoroscope;

public class response1 {

	
	private String httpStatus;
	private String httpStatusCode;
	private String success;
	private String message;
	private String apiName;

	private List<allHoroscope> data;

	@Override
	public String toString() {
		return "response1 [httpStatus=" + httpStatus + ", httpStatusCode=" + httpStatusCode + ", success=" + success
				+ ", message=" + message + ", apiName=" + apiName + ", data=" + data + "]";
	}

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

	public List<allHoroscope> getData() {
		return data;
	}

	public void setData(List<allHoroscope> data) {
		this.data = data;
	}

	public response1(String httpStatus, String httpStatusCode, String success, String message, String apiName,
			List<allHoroscope> data) {
		super();
		this.httpStatus = httpStatus;
		this.httpStatusCode = httpStatusCode;
		this.success = success;
		this.message = message;
		this.apiName = apiName;
		this.data = data;
	}

	public response1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



}
