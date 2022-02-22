package com.qa.day4.abstraction;

public class Bird extends Animal {

	@Override
	public void eat() {
		System.out.println("Eats like bird");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps like a bird");
	}

}
