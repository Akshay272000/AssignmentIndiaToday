package com.example.demo.entity.banner_offfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class metadata {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productCode;
	private String productName;
	private String professionalSlug;
	
	
	
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProfessionalSlug() {
		return professionalSlug;
	}
	public void setProfessionalSlug(String professionalSlug) {
		this.professionalSlug = professionalSlug;
	}
	public metadata(int id, String productCode, String productName, String professionalSlug) {
		super();
		this.id = id;
		this.productCode = productCode;
		this.productName = productName;
		this.professionalSlug = professionalSlug;
	}
	@Override
	public String toString() {
		return "metadata [id=" + id + ", productCode=" + productCode + ", productName=" + productName
				+ ", professionalSlug=" + professionalSlug + "]";
	}
	public metadata() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
