package com.neosoftmail.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addMicro")
public class Address {

	private String currentAddress;
	private String permanentAddress;
	
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
}
