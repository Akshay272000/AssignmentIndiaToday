package com.example.demo.entity.reports;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class services {

	private List<Reports> services;

	public List<Reports> getServices() {
		return services;
	}

	public void setServices(List<Reports> services) {
		this.services = services;
	}

	public services(List<Reports> services) {
		super();
		this.services = services;
	}

	public services() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "services [services=" + services + "]";
	}

	
	
	
	
}
