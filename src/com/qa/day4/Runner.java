package com.qa.day4;

import com.qa.day4.encapsulation.Hotel;
import com.qa.day4.encapsulation.Person;

public class Runner {

	public static void main(String[] args) {
		//step 1 - create some instances of person
		Person richard = new Person("Richard", 25, "Trainer");
		Person bob = new Person("Bob", 29, "Builder");
	
		//step 2 - create instance of hotel, so i can people and find people
		Hotel anyHotel = new Hotel();

		//step 3 - adding people into the hotel
		anyHotel.addToHotel(bob);
		anyHotel.addToHotel(richard);
		
		//step 4 - finding a person and printing to the console
		System.out.println(anyHotel.findByName("Steve"));
		
	}
	
}
