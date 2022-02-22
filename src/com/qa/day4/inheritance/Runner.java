package com.qa.day4.inheritance;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("Ford", "Fiesta", 1.0, 4, "Red");
		Vehicle car2 = new Car("BMW", "3 series", 2.0, 4, "Silver");

		Animal zebra = new Zebra(false, true, 8);
		Animal lion = new Lion(true, true, true);

		Object lion2 = new Lion(true, true, true);
		
		
		System.out.println(zebra instanceof Object);

		System.out.println("\n=========================\n");
		((Zebra) zebra).runFromLion();
		
		
		System.out.println("\n=========================\n");

		System.out.println(car.toString());
		System.out.println(car2.toString());

		System.out.println(zebra.toString());
		System.out.println(lion.toString());
	}

	// zebra - lion == Animal
	public void doEat(Animal animal) {
		if(animal instanceof Lion) {
			
		}
	}

//	// lion != Zebra
//	public void doEat(Zebra input) {
//
//	}
//
//	// lion != Zebra
//	public void doEat(Lion input) {
//
//	}

}
