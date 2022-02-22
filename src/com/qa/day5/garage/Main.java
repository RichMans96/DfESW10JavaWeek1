package com.qa.day5.garage;

public class Main {

	public static void main(String[] args) {
		Garage myGarage = new Garage();
		
		Vehicle car1 = new Car(1,50, "Ford", "Fiesta", false, 2);
		Vehicle car2 = new Car(2, 150, "BMW", "3 series", true, 10);
		Vehicle boat = new Boat(3, 80, "Boaty", "McBoatface", false, false);

		myGarage.addToGarage(boat);
		myGarage.addToGarage(car1);
		myGarage.addToGarage(car2);
		
		myGarage.calcAllBills();
		myGarage.bill(car1);
		
		System.out.println(boat.getVehicleId());
		System.out.println(car1.getVehicleId());
		System.out.println(car2.getVehicleId());
		myGarage.removeVehicleById(2);
		
		System.out.println(myGarage.toString());	
		}

}
