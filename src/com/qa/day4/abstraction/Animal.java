package com.qa.day4.abstraction;

public abstract class Animal {
	
	private int numOfLegs;
	private boolean hasFur;
	
	public Animal() {}
	
	public Animal(int numOfLegs, boolean hasFur) {
		super();
		this.numOfLegs = numOfLegs;
		this.hasFur = hasFur;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	public abstract void eat();
	
	public abstract void sleep();

}
