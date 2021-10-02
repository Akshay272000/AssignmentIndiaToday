package com.example.demo.entity.horoscope_json;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.entity.astro.LargeImage;
import com.example.demo.entity.astro.MediumImage;

@Entity(name = "Imagehoro")
public class Image {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "smallid" , referencedColumnName = "id")
	private SmallImage small;
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
	public SmallImage getSmall() {
		return small;
	}
	public void setSmall(SmallImage small) {
		this.small = small;
	}
	public Image(int id, SmallImage small, LargeImage large, MediumImage medium) {
		super();
		this.id = id;
		this.small = small;
		this.large = large;
		this.medium = medium;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
