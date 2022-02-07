package com.qa;

import com.qa.day1.Calculator;
import com.qa.day1.calcexercise.CalculatorExercise;
import com.qa.day1.resultsexercise.Results;

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
		
		
		Results results = new Results(50, 45, 60);
		
		results.finalResults();
		results.percentage();
	}

}
