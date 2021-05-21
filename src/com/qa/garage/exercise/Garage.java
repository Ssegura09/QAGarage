package com.qa.garage.exercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	// Attributes
	
	private String lotName;
	
	// Constructor
	
	public Garage() {
		super();
		this.lotName = "Lot Number ?";
	}
	public Garage(String lotName) {
		super();
		this.lotName = lotName;
	}
	
	//Getter and Setters // Read only
	
	public String getLotName() {
		return lotName;
	}
	

	//Methods

	List<Object> myLot = new ArrayList<Object>();
	
	
	
	
	
	
	
	
	

}
