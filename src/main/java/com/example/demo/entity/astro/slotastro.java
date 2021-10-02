package com.example.demo.entity.astro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class slotastro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "toFormat")
	private String toFormat;
	private String fromFormat;
	@Column(name = "fromtime")
	private String from;
	@Column(name = "totime")
	private String to;
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToFormat() {
		return toFormat;
	}
	public void setToFormat(String toFormat) {
		this.toFormat = toFormat;
	}
	public String getFromFormat() {
		return fromFormat;
	}
	public void setFromFormat(String fromFormat) {
		this.fromFormat = fromFormat;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public slotastro(int id, String toFormat, String fromFormat, String from, String to) {
		super();
		this.id = id;
		this.toFormat = toFormat;
		this.fromFormat = fromFormat;
		this.from = from;
		this.to = to;
	}
	public slotastro() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "slotastro [id=" + id + ", toFormat=" + toFormat + ", fromFormat=" + fromFormat + ", from=" + from
				+ ", to=" + to + "]";
	}
	


	
	
    
	
	
	
	
	
	
	
	
	
	
}
