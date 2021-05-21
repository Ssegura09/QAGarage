package com.qa.garage.exercise;

public class Suv extends Vehicle {

	// Constructor
	public Suv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suv(String manufactuer, int numTires, int numDoors) {
		super(manufactuer, numTires, numDoors);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fuelUp() {
		System.out.println("Gas is running low...Time to fuel up!");
		
	}

	@Override
	public void service() {
		System.out.println("ATTN: Tire pressure is low! Please go to the nearest service center! ");
		
	}
	


	@Override
	public String toString() {
		return "Suv made by " + getManufacturer() + " it has " + getNumTires() + " tires"
				+ ", it has " + getNumDoors() + " doors";
	}
	

	

}
