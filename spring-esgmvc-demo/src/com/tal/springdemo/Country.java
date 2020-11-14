package com.tal.springdemo;

import java.util.LinkedHashMap;

public class Country {
	private LinkedHashMap<String, String> countryOptions;
	public Country() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("USA", "USA");
		countryOptions.put("Germany", "Germany");
		countryOptions.put("Tunisia", "Tunisia");
		countryOptions.put("South Korea", "South Korea");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}	
	
}
