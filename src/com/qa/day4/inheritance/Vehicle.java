package com.qa.day4.inheritance;

public class Vehicle {
	
	private int numOfWheels;
	private String colour;
	
	public Vehicle() {}
	
	public Vehicle(int numOfWheels, String colour) {
		super();
		this.numOfWheels = numOfWheels;
		this.colour = colour;
	}


	public int getNumOfWheels() {
		return numOfWheels;
	}


	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
}
