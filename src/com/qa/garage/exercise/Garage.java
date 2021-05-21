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
	
	public List<Object> getMyGarage() {
		return myGarage;
	}

	
	// list to store the vehicles

	List<Object> myGarage = new ArrayList<Object>();
	
	public void addVehicle(Object vehicle) {
		myGarage.add(0, vehicle);;
	}
	
	
	

}
