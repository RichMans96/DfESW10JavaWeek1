package com.qa.day5.garage;

public class Vehicle {
	
	private int vehicleId;
	private int horsePower;
	private String model;
	private String make;
	
	public Vehicle() {}
	
	public Vehicle(int id, int horsePower, String model, String make) {
		super();
		this.vehicleId = id;
		this.horsePower = horsePower;
		this.model = model;
		this.make = make;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	
	
}
