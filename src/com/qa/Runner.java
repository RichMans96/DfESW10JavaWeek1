package com.qa;

import com.qa.day2.classesexample.RoastDinner;
import com.qa.day3.encapsulation.Car;

public class Runner {

	public static void main(String[] args) {
//		CalculatorExercise calc = new CalculatorExercise();
//		Calculator calc2 = new Calculator(5, 2);
//		
//		System.out.println(calc.addition(10, 20));
//		System.out.println(calc.multiply(26, 50));
//		System.out.println(calc.divide(54, 23));
//		System.out.println(calc.subtraction(4, 5));
//		calc2.addition();
//		
//		Results results = new Results(50, 45, 60);
//		
//		results.finalResults();
//		results.percentage();
		
		Car car = new Car();
		
		
		
		RoastDinner roast = new RoastDinner("Lamb", true, 6, 2, true);
		
		
		roast.cook();
		System.out.println(roast.toString());
		
	}

}
