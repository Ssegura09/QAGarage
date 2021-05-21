package com.qa.garage.exercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> contentsOfGarage = new ArrayList<Vehicle>();
	
	// Attributes
	private String nameOfGarage;

	// Constructor
	public Garage(String nameOfGarage) {
		super();
		this.nameOfGarage = nameOfGarage;
	}

	//Getter and Setters // Read only

	public String getNameOfGarage() {
		return nameOfGarage;
	}
	
	
	// Methods
	

	@Override
	public String toString() {
		return "Garage Contents: " + contentsOfGarage;
	}
	
	public void showVehicles() {
		System.out.println("Hi there! " + "\n" + "The following vehicles are in " + this.nameOfGarage + "\n" + "*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
		
		for (int i = 0; i < contentsOfGarage.size(); i++) {
			System.out.println(contentsOfGarage.get(i));
		}
	}
	
	public void addVehicle(Vehicle input) {
		contentsOfGarage.add(input);	
	}
	
	public void removeVehicle(Vehicle input) {
		contentsOfGarage.remove(input);	
	}
	
	public void removeById(int i) {
		contentsOfGarage.remove(i);		
	}
	
	
	public void vehicleBill() {
		double total = 0d;
		
		for (Vehicle v: contentsOfGarage) {
			if (v instanceof Motorcycle) {
				total += 300d;
			}
			else if ( v instanceof Suv) {
				total += 400d;
			} else {
				total += 500d;
			}
		}
		System.out.println("Your total bill is " + total);
		
	}
	
}
