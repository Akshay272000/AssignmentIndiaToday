package com.example.demo.entity.astro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MediumImage {

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
	public MediumImage(String imageUrl, int id) {
		super();
		this.imageUrl = imageUrl;
		this.id = id;
	}
	public MediumImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MediumImage [imageUrl=" + imageUrl + ", id=" + id + "]";
	}
	
}
