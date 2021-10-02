package com.example.demo.entity.astro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LargeImage {

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
	public LargeImage(String imageUrl, int id) {
		super();
		this.imageUrl = imageUrl;
		this.id = id;
	}
	public LargeImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LargeImage [imageUrl=" + imageUrl + ", id=" + id + "]";
	}
	
	
	
	
}
