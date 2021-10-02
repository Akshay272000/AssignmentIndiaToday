package com.example.demo.entity.reports;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Reports {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String productCode;
	private String imageUrl;
    private String availableLanguages[];
    private String indepthPoints[];
	private String description;
	private String price;
	private String offerPrice;
	
	
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String[] getAvailableLanguages() {
		return availableLanguages;
	}
	public void setAvailableLanguages(String[] availableLanguages) {
		this.availableLanguages = availableLanguages;
	}
	public String[] getIndepthPoints() {
		return indepthPoints;
	}
	public void setIndepthPoints(String[] indepthPoints) {
		this.indepthPoints = indepthPoints;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}
	public Reports(int id, String name, String productCode, String imageUrl, String[] availableLanguages,
			String[] indepthPoints, String description, String price, String offerPrice) {
		super();
		this.id = id;
		this.name = name;
		this.productCode = productCode;
		this.imageUrl = imageUrl;
		this.availableLanguages = availableLanguages;
		this.indepthPoints = indepthPoints;
		this.description = description;
		this.price = price;
		this.offerPrice = offerPrice;
	}
	public Reports() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Reports [id=" + id + ", name=" + name + ", productCode=" + productCode + ", imageUrl=" + imageUrl
				+ ", availableLanguages=" + Arrays.toString(availableLanguages) + ", indepthPoints="
				+ Arrays.toString(indepthPoints) + ", description=" + description + ", price=" + price + ", offerPrice="
				+ offerPrice + "]";
	}
	
	
	
	

	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
