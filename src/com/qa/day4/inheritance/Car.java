package com.qa.day4.inheritance;

public class Car extends Vehicle {

	private String make;
	private String model;
	private double engineSize;
	
	public Car(String make, String model, double engineSize, 
			int numOfWheels, String colour) {
		super(numOfWheels, colour);
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
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

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	// use to tell the compilier that we're changing an inherited method
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engineSize=" + engineSize + ", getNumOfWheels()="
				+ super.getNumOfWheels() + ", getColour()=" + super.getColour() + "]";
	}
	
	
	
	
	
}
