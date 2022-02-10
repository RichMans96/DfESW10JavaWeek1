package com.qa.day4.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	//step 1 - create list implementation
	List<Person> listOfPeople = new ArrayList<Person>();
	
	//step 2 - method to add add a person to the list
	public void addToHotel(Person person) {
		listOfPeople.add(person);
	} 
					
	//step 3 - a method with some logic to find a person in that list
	public Person findByName(String name) {
		Person foundPerson = null;
		//step 1 - loop through the list
		for(Person person : listOfPeople) {
			//step 2 - check each persons name against the name passed in as
			//an argument/parameter to the method - name on line 16
			if(person.getName().equals(name)) {
				//step 3 - if we get a match save that match to the 
				// foundPerson variable
				foundPerson = person;
			}
		}
		//step 4 - return the found person
		return foundPerson;
	}

	
}
