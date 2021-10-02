package com.example.demo.entity.questions;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question_json {

	@Id
	private int id;
	private String name;
	private int price;
	private String description;
	private String suggestion[];
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "suggestionsid" , referencedColumnName = "id")
//	private List<suggestions> suggestions;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String[] suggestion) {
		this.suggestion = suggestion;
	}

	public Question_json(int id, String name, int price, String description, String[] suggestion) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.suggestion = suggestion;
	}

	public Question_json() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question_json [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", suggestion=" + Arrays.toString(suggestion) + "]";
	}

//	public List<String> getSuggestion() {
//		return suggestion;
//	}
//
//	public void setSuggestion(List<String> suggestion) {
//		this.suggestion = suggestion;
//	}
//
//	public Question_json(int id, String name, int price, String description, List<String> suggestion) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.description = description;
//		this.suggestion = suggestion;
//	}
//
//	public Question_json() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "Question_json [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
//				+ ", suggestion=" + suggestion + "]";
//	}

	

	
	
	
	
}
