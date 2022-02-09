package com.qa.day3.encapsulation;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car(5, "Ford", "ka");
		
	
		car.setNumOfDoors(3);
		System.out.println(car.getNumOfDoors());

	}

}
