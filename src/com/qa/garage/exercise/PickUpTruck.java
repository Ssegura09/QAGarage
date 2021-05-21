package com.qa.garage.exercise;

public class PickUpTruck extends Vehicle {

	// Constructor
	public PickUpTruck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PickUpTruck(String manufactuer, int numTires, int numDoors) {
		super(manufactuer, numTires, numDoors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fuelUp() {
		System.out.println("Diesel is running low...Time to fuel up!");
		
	}

	@Override
	public void service() {
		System.out.println("ATTN: Time for an Oil Change! Please go to the nearest service center! ");
		
	}
	
	

}
