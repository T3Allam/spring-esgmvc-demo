package com.tal.springdemo.entity;

import java.time.*;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.tal.springdemo.Country;
import com.tal.springdemo.EsgIssue;
import com.tal.springdemo.Sector;

@Entity
@Table(name="document")
public class Document {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="source")
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String source;
	
	@Column(name="url")
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String url;
	
	@Column(name="title")
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="sector")
	private String sector;
	
	@Column(name="date")
	@NotNull(message="required")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	@Column(name="company")
	@NotNull
	@Size(min=1, message="required")
	private String company;
	
	@Column(name="country")
	private String country;
	
	transient private EsgIssue esgOptions;
	transient private Country countryOptions;
	transient private Sector sectorOptions;
	
	@Column(name="approved")
	private boolean approved;
	
	@Column(name="esg_issues")
	private String esgIssue;
	
	public Document() {
		sectorOptions = new Sector();
		countryOptions = new Country();
		esgOptions = new EsgIssue();
	}
	
	public int getId() {
		return id;
	}

	public LinkedHashMap<String, String> getEsgOptions() {
		return esgOptions.getEsgOptions();
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions.getCountryOptions();
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
	
	public String getEsgIssue() {
		return esgIssue;
	}

	public void setEsgIssue(String esgIssue) {
		this.esgIssue = esgIssue;
	}
}
	