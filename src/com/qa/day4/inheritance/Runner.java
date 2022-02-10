package com.qa.day4.inheritance;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("Ford", "Fiesta", 1.0, 4, "Red");
		Vehicle car2 = new Car("BMW", "3 series", 2.0, 4, "Silver");
		
		System.out.println(car.toString());
		System.out.println(car2.toString());
	}

}
