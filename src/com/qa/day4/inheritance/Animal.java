package com.qa.day4.inheritance;

public class Animal {
	private boolean canFly;
	private boolean isHungry;
	
	
	public Animal(boolean canFly, boolean isHungry) {
		super();
		this.canFly = canFly;
		this.isHungry = isHungry;
	}


	public boolean isCanFly() {
		return canFly;
	}


	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}


	public boolean isHungry() {
		return isHungry;
	}


	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	public void eat() {
		if(isHungry) {
			System.out.println("I am eating");
		} else {
			System.out.println("I'm not hungry");
		}
	}
	
	public void sleep() {
		System.out.println("I am sleeping");
	}


	@Override
	public String toString() {
		return "Animal [canFly=" + canFly + ", isHungry=" + isHungry + "]";
	}
	
	
	
}
