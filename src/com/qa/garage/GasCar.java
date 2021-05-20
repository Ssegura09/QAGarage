package com.qa.garage;

public class GasCar extends Car {

	public GasCar(String manufacturer, String model, String doc) {
		super(manufacturer, model, doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		System.out.println("Increasing fuel flow");
		System.out.println("Clutch connected");
		System.out.println("Accelerating");
	}

	@Override
	public void breaking() {
		System.out.println("Applying front disk brakes and rear drum brakes");
		
	}

}
