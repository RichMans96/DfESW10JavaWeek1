package com.qa.day3;

public class LoopsExercises {

	public static void main(String[] args) {
		
		
		for(int i = 100; i <= 200; i++) {
			System.out.println(i);
		}

		System.out.println("\n=================\n");
		
		for(int i = 100; i <= 200; i++) {
			if(i % 2 == 0) {
				System.out.println("-: " + i);
			} else {
				System.out.println("*: " + i);
			}
		}
		
		System.out.println("\n=================\n");
	}

}
