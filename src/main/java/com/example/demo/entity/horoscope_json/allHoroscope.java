package com.example.demo.entity.horoscope_json;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class allHoroscope {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	private String name;
	private String date;
	private String img;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "imageid" , referencedColumnName = "id")
	private Image images;
	private String urlSlug;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getUrlSlug() {
		return urlSlug;
	}
	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}
	public Image getImages() {
		return images;
	}
	public void setImages(Image images) {
		this.images = images;
	}
	public allHoroscope(int id, String name, String date, String img, Image images, String urlSlug) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.img = img;
		this.images = images;
		this.urlSlug = urlSlug;
	}
	public allHoroscope() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "allHoroscope [id=" + id + ", name=" + name + ", date=" + date + ", img=" + img + ", images=" + images
				+ ", urlSlug=" + urlSlug + "]";
	}
	
	
	
	
	
	
	
}
