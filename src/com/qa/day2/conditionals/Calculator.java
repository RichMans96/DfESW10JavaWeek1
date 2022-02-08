package com.qa.day2.conditionals;

public class Calculator {

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(double num1, double num2) {
		if (num1 < num2) {
			return num1 / num2;
		} else {
			return 0;
		}
	}
}
