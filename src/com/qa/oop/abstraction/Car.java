package com.qa.oop.abstraction;

public abstract class Car implements DrivingBehavior {

	// Attributes
	private String manufacturer;
	private String model;
	private String dateOfCreation;

	// Constructor
	public Car(String manufacturer, String model, String doc) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.dateOfCreation = doc;
	}

	// Getter and Setters //read only
	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

}
