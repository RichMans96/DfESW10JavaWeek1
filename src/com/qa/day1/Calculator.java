package com.qa.day1;

public class Calculator {
	//Instance Class Members - Variables
	int num1;
	int num2;
	public static int num3 = 10;
	
	//Is a blueprint of an Object
	//default constructor
	public Calculator() {}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	//Instance Class Members - Methods
	public void addition() {
		System.out.println(num1 + num2);
	}
	
	//Static class Members - Methods
	//Belong to the type, not the instance
	public static int additionStatic() {
		return num3 + 50;
	}

}
