package com.qa.day4.inheritance;

public class Zebra extends Animal {
	private int numOfStripes;

	public Zebra(boolean canFly, boolean isHungry, int numOfStripes) {
		super(canFly, isHungry);
		this.numOfStripes = numOfStripes;
	}

	public int getNumOfStripes() {
		return numOfStripes;
	}

	public void setNumOfStripes(int numOfStripes) {
		this.numOfStripes = numOfStripes;
	}
	
	public void runFromLion() {
		System.out.println("Running away");
	}

	@Override
	public String toString() {
		return "Zebra [numOfStripes=" + numOfStripes + ", isCanFly()=" + isCanFly() + ", isHungry()=" + isHungry()
				+ "]";
	}
	
	
	
}
