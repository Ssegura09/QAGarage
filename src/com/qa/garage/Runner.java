package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// Car has provided an interface on how to interact with cars
		Car eCar = new ElectricCar("Mazda", "MX-5", "2019");
		Car gasCar = new GasCar("Mazda", "787B", "1992");
		
		eCar.accelerate();
		System.out.println(gasCar.getDateOfCreation());

	}
 
}
