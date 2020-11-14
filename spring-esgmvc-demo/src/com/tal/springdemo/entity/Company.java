package com.tal.springdemo.entity;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tal.springdemo.Country;
import com.tal.springdemo.Sector;

@Entity
@Table(name="company")
public class Company {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String name;	
	@Column(name="url")
	private String url;	
	@Column(name="description")
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String description;	
	@Column(name="headquarters")
	@NotNull(message="required")
	private String headquarters;	
	@Column(name="sector")
	private String sector;	
	@Column(name="approved")
	private boolean approved;
	
	transient private Country countryOptions;
	transient private Sector sectorOptions;

	public Company() {
		countryOptions = new Country();
		sectorOptions = new Sector();
	}
	
	public int getId() {
		return id;
	}	
	
	public LinkedHashMap<String, String> getSectorOptions() {
		return sectorOptions.getSectorOptions();
	}
		
	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions.getCountryOptions();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
}
