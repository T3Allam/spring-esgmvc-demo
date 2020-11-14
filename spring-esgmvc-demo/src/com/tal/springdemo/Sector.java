package com.tal.springdemo;

import java.util.LinkedHashMap;

public class Sector {
	private LinkedHashMap<String, String> sectorOptions;
	public Sector() {
		sectorOptions = new LinkedHashMap<>();
		sectorOptions.put("Banks", "Banks"); 
		sectorOptions.put("Chemicals", "Chemicals"); 
		sectorOptions.put("Airlines", "Airlines"); 
		sectorOptions.put("Energy", "Energy");
		sectorOptions.put("Financial Services", "Financial Services");
	}
	public LinkedHashMap<String, String> getSectorOptions() {
		return sectorOptions;
	}
	
}
