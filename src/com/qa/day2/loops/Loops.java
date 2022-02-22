package com.qa.day2.loops;

public class Loops {

	public static void main(String[] args) {
		
		int finalNum = 100;
		
		for(int i = 1; i < finalNum; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n=================\n");

		int counter = 11;
		
		while(counter < 10) {
			System.out.println(counter);
			counter++;
		}
		
		
		System.out.println("\n=================\n");
		
		int count = 22;
		do {
			System.out.println("Hello" + count);
			count++;
			System.out.println("Hello" + count);
		} while(count < 21);
			
	}

}
