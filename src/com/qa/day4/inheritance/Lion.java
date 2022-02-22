package com.qa.day4.inheritance;

public class Lion extends Animal {

	private boolean hasMane;
	
	public Lion(boolean canFly, boolean isHungry, boolean hasMane) {
		super(canFly, isHungry);
		this.hasMane = hasMane;
	}

	public boolean isHasMane() {
		return hasMane;
	}

	public void setHasMane(boolean hasMane) {
		this.hasMane = hasMane;
	}
	
	public void chaseZebra() {
		System.out.println("Chasing zebra");
	}

	@Override
	public String toString() {
		return "Lion [hasMane=" + hasMane + ", isCanFly()=" + isCanFly() + ", isHungry()=" + isHungry()
				+ "]";
	}
	
	
	
}
