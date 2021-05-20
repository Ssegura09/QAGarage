package com.qa.garage;

public abstract class Car {

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

	// Method

	public abstract void accelerate();

	public abstract void breaking();

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
