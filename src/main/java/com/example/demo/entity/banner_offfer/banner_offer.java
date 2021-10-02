package com.example.demo.entity.banner_offfer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class banner_offer {

	@Id
	private int id;
	private String name;
	private String landingUrl;
	private String orderType;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "metaid" , referencedColumnName = "id")
	private metadata metaData;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "imagebannerid",referencedColumnName = "id")
	private Image images;
	
//	metadata left
//	images left
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLandingUrl() {
		return landingUrl;
	}
	public void setLandingUrl(String landingUrl) {
		this.landingUrl = landingUrl;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public metadata getMetaData() {
		return metaData;
	}
	public void setMetaData(metadata metaData) {
		this.metaData = metaData;
	}
	public Image getImages() {
		return images;
	}
	public void setImages(Image images) {
		this.images = images;
	}
	public banner_offer(int id, String name, String landingUrl, String orderType, metadata metaData, Image images) {
		super();
		this.id = id;
		this.name = name;
		this.landingUrl = landingUrl;
		this.orderType = orderType;
		this.metaData = metaData;
		this.images = images;
	}
	public banner_offer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "banner_offer [id=" + id + ", name=" + name + ", landingUrl=" + landingUrl + ", orderType=" + orderType
				+ ", metaData=" + metaData + ", images=" + images + "]";
	}
	
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
}
