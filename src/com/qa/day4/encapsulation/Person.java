package com.qa.day4.encapsulation;

public class Person {
	
	// the variables contain our information
	// Step 1
	private String name;
	private int age;
	private String jobTitle;

	//Allows us an empty person
	//Step 2 - constructors
	public Person() {}
	
	//Creates our person with 3 inputs
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	//Getters retrieve values
	//Step 3 - getters and/or setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	//Step 4 anything else / additional methods
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
}
