package com.qa;

import com.qa.garage.exercise.Motorcycle;
import com.qa.garage.exercise.PickUpTruck;
import com.qa.garage.exercise.Specs;
import com.qa.garage.exercise.Suv;
import com.qa.garage.exercise.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Vehicle m1 = new Motorcycle("Suzuki", 2, 0);
		m1.service();
		
		Vehicle s1 = new Suv("Toyota", 4, 4);
		s1.fuelUp();
		
		PickUpTruck pt1 = new PickUpTruck("Chevrolet", 4, 2);
		pt1.service();
		
		Specs spec = new Suv ("Nissan", 4, 4);
		spec.fuelUp();
	}
 
}
