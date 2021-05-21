package com.qa.garage.exercise;

public abstract class Vehicle extends Garage implements Specs {

	// Attributes
	private String manufacturer;
	private int numTires;
	private int numDoors;

	// Constructor
	public Vehicle() {
		super();
		this.manufacturer = "???";
		this.numTires = 2;
		this.numDoors = 0;
	}
	
	public Vehicle(String manufactuer, int numTires, int numDoors) {
		super();
		this.manufacturer = manufactuer;
		this.numTires = numTires;
		this.numDoors = numDoors;
	}

	// Getters
	public String getManufacturer() {
		return manufacturer;
	}


	public int getNumTires() {
		return numTires;
	}

	public int getNumDoors() {
		return numDoors;
	}

	
	

}
