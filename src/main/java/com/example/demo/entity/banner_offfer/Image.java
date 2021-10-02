package com.example.demo.entity.banner_offfer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.example.demo.entity.astro.MediumImage;
@Entity(name = "imageBanner")
public class Image {

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mediumeidbanner" , referencedColumnName = "id")
	private MediumImage medium;
	
	@Id
	private int id;

	public MediumImage getMedium() {
		return medium;
	}

	public void setMedium(MediumImage medium) {
		this.medium = medium;
	}

//	public int getId() {
//		return id;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public Image(MediumImage medium, int id) {
		super();
		this.medium = medium;
		this.id = id;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Image [medium=" + medium + ", id=" + id + "]";
	}
	
	
	
	
}
