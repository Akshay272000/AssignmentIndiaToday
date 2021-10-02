package com.example.demo.entity.astro;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Image {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "largeid" , referencedColumnName = "id")
	private LargeImage large;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mediumeid" , referencedColumnName = "id")
	private MediumImage medium;
	
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public LargeImage getLarge() {
		return large;
	}
	public void setLarge(LargeImage large) {
		this.large = large;
	}
	public MediumImage getMedium() {
		return medium;
	}
	public void setMedium(MediumImage medium) {
		this.medium = medium;
	}
	public Image(int id, LargeImage large, MediumImage medium) {
		super();
		this.id = id;
		this.large = large;
		this.medium = medium;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", large=" + large + ", medium=" + medium + "]";
	}
	
	
	
	
}
