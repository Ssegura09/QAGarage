package com.qa.garage;

public class ElectricCar extends Car {

	public ElectricCar(String manufacturer, String model, String doc) {
		super(manufacturer, model, doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		System.out.println("Voltage Check: OK");
		System.out.println("Connecting circuit");
		System.out.println("Motor spinning");
		
	}

	@Override
	public void breaking() {
		System.out.println("Applying the electric brakes");
		
	}

	

}
