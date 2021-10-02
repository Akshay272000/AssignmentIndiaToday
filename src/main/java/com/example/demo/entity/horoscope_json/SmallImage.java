package com.example.demo.entity.horoscope_json;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SmallImage {

	private String imageUrl;
	@Id
	private int id;
	
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SmallImage(String imageUrl, int id) {
		super();
		this.imageUrl = imageUrl;
		this.id = id;
	}
	public SmallImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MediumImage [imageUrl=" + imageUrl + ", id=" + id + "]";
	}
	
}
