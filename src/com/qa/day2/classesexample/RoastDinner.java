package com.qa.day2.classesexample;

public class RoastDinner {
	String meat;
	boolean hasSprouts;
	int numOfPotatoes;
	int numOfYorkshirePuddings;
	boolean hasGravy;
	
	//Default constructor
	public RoastDinner() {}
	
	// Method overloading
	//All args(arguments) constructor
	public RoastDinner(String meat, boolean hasSprouts, int numOfPotatoes,
			int numOfYorkshirePuddings, boolean hasGravy) {
		this.meat = meat;
		this.numOfPotatoes = numOfPotatoes;
		this.numOfYorkshirePuddings = numOfYorkshirePuddings;
		this.hasGravy = hasGravy;
		this.hasSprouts = hasSprouts;
	}
	
	public void cook() {
		System.out.println("I'm cooking");
	}

	@Override
	public String toString() {
		return "RoastDinner [meat=" + meat + ", hasSprouts=" + hasSprouts + ", numOfPotatoes=" + numOfPotatoes
				+ ", numOfYorkshirePuddings=" + numOfYorkshirePuddings + ", hasGravy=" + hasGravy + "]";
	}
	
	
	
}
