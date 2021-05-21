package com.qa.oop.abstraction;

public class ElectricCar extends Car {

	public ElectricCar(String manufacturer, String model, String doc) {
		super(manufacturer, model, doc);
		// TODO Auto-generated constructor stub
	}
	
	// This is virtual method invocation
	@Override
	public void accelerating() {
		System.out.println("Voltage Check: OK");
		System.out.println("Connecting circuit");
		System.out.println("Motor spinning");
		
	}

	@Override
	public void breaking() {
		System.out.println("Applying the electric brakes");
		
	}

	

}
