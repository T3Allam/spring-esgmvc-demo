package com.tal.springdemo;

import java.util.LinkedHashMap;

public class EsgIssue {
	private LinkedHashMap<String, String> esgOptions;
	public EsgIssue() {
		esgOptions = new LinkedHashMap<>();
		esgOptions.put("IOC", "IOC"); 
		esgOptions.put("CBML", "CBML"); 
		esgOptions.put("VNL", "VNL"); 
		esgOptions.put("VIS", "VIS");
		esgOptions.put("LP", "LP");
	}
	public LinkedHashMap<String, String> getEsgOptions() {
		return esgOptions;
	}
	
}
