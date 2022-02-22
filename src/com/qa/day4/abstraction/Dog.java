package com.qa.day4.abstraction;

public class Dog extends Animal implements MammalThings, DogThings  {
	
	private String breed;


	public Dog(String breed, int numOfLegs, boolean hasFur) {
		super(numOfLegs, hasFur);
		this.breed = breed;
	}
	
	

	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	@Override
	public void eat() {
		System.out.println("Eats like a dog");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps like a dog");
		
	}



	@Override
	public void mammalThing1() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mammalThing2() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mammalThing3() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void dogThings() {
		// TODO Auto-generated method stub
		
	}

}
