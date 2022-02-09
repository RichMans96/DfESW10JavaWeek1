package com.qa.day3.encapsulation;

public class Car {

	private int numOfDoors;
	private String make;
	private String model;
	
	public Car() {
		//constructor of super class
		super();
	}

	public Car(int numOfDoors, String make, String model) {
		super();
		this.numOfDoors = numOfDoors;
		this.make = make;
		this.model = model;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [numOfDoors=" + numOfDoors + ", make=" + make + ", model=" + model + "]";
	}
	
	
}
