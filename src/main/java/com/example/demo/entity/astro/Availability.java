package com.example.demo.entity.astro;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Availability {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String days[];
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "availid" , referencedColumnName = "id")
	private slotastro slot;
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getDays() {
		return days;
	}
	public void setDays(String[] days) {
		this.days = days;
	}
	public slotastro getSlot() {
		return slot;
	}
	public void setSlot(slotastro slot) {
		this.slot = slot;
	}
	public Availability(int id, String[] days, slotastro slot) {
		super();
		this.id = id;
		this.days = days;
		this.slot = slot;
	}
	public Availability() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Availability [id=" + id + ", days=" + Arrays.toString(days) + ", slot=" + slot + "]";
	}
	
	
	
	
	
}
