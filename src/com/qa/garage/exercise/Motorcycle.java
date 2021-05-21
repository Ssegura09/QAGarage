package com.qa.garage.exercise;

public class Motorcycle extends Vehicle {
	
	// Constructor

	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String manufactuer, int numTires, int numDoors) {
		super(manufactuer, numTires, numDoors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fuelUp() {
		System.out.println("Gas is running low...Time to fuel up!");
		
	}

	@Override
	public void service() {
		System.out.println("ATTN: Service needed! Please go to the nearest service center! ");
		
	}

	

	
}
