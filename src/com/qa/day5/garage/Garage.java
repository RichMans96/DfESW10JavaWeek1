package com.qa.day5.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vehicle> garage = new ArrayList<>();
	
	public void addToGarage(Vehicle vh) {
		garage.add(vh);
	}
	
	public void calcAllBills() {
		for(Vehicle vh : garage) {
			bill(vh);
		}
	}
	
	public void empty() {
		garage.clear();
	}
	
	public void fix(Vehicle vh) {
		bill(vh);
	}
	
	
	public void bill(Vehicle vehicle) {
		float baseRate = 2.5f;
		if(vehicle instanceof Car) {
			System.out.println("Your bill is: " + baseRate * 10);
		} else if(vehicle instanceof Boat) {
			System.out.println("Your bill is: " + baseRate * 20);
		} else {
			System.out.println("I don't know what that is");
		}
		
	}
	
	public void removeVehicleById(int id) {
		Vehicle found = null;
		for(Vehicle vh : garage) {
			if(vh.getVehicleId() == id) {
				found = vh;
			}
		}
		int indexOfVehicle = garage.indexOf(found);
		garage.remove(indexOfVehicle);

	}

}
