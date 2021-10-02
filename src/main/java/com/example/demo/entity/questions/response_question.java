package com.example.demo.entity.questions;

import java.util.List;

public class response_question {
	

		
		private String httpStatus;
		private String httpStatusCode;
		private String success;
		private String message;
		private String apiName;
		
		private List<Question_json> data;

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

		public List<Question_json> getData() {
			return data;
		}

		public void setData(List<Question_json> data) {
			this.data = data;
		}

		public response_question(String httpStatus, String httpStatusCode, String success, String message,
				String apiName, List<Question_json> data) {
			super();
			this.httpStatus = httpStatus;
			this.httpStatusCode = httpStatusCode;
			this.success = success;
			this.message = message;
			this.apiName = apiName;
			this.data = data;
		}

		public response_question() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "response_question [httpStatus=" + httpStatus + ", httpStatusCode=" + httpStatusCode + ", success="
					+ success + ", message=" + message + ", apiName=" + apiName + ", data=" + data + "]";
		}

		
		
		
		
		
		
		
		



	

}
