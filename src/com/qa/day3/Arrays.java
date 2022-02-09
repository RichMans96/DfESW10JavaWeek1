package com.qa.day3;

public class Arrays {

	public static void main(String[] args) {

		int[] emptyArr;
		// 0 1 2 3
		int[] arrayInts = { 1, 4, 5, 6 };

		// 0 1 2 3 4
		// {0, 0, 0, 0, 0}
		int[] definedSize = new int[5];

		System.out.println(arrayInts.length);
		System.out.println(arrayInts[2]);

		System.out.println("\n================================== \n");

		System.out.println(definedSize[4]);
		definedSize[2] = 15;
		// definedSize -> {0, 0, 15, 0, 0}
		System.out.println(definedSize[2]);

		System.out.println("\n================================== \n");

		for (int i = 0; i < definedSize.length; i++) {
			System.out.println(i);
			System.out.println(definedSize[i]);
		}

		System.out.println("\n===============MulitDimensionalArrays================== \n");
		int[][] emptyMultiArr;

		int[][] multiArrayInts = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

		// {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}}
		int[][] multiDefinedSize = new int[5][3];

		multiDefinedSize[3][2] = 6;

		System.out.println(multiDefinedSize[3][2]);

		System.out.println("\n================================== \n");
		// {{}, {}, {}} length = 3
		for (int i = 0; i < multiArrayInts.length; i++) {
			// {1, 2} i++ {3, 4} i++ {5, 6, 7}
			for (int j = 0; j < multiArrayInts[i].length; j++) {
				System.out.println(multiArrayInts[i][j]);
			}

		}

		System.out.println("\n===============Enhanced(foreach)================ \n");

		for (int num : arrayInts) {
			System.out.println(num);
		}

		System.out.println("\n================================== \n");

		for (int[] array : multiArrayInts) {
			for (int num : array) {
				System.out.println(num);
			}
		}

		System.out.println("\n================================== \n");
		System.out.println("Q1 \n");
		int[] array1 = new int[10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
			System.out.println(array1[i]);
		}

		System.out.println("\n================================== \n");
		System.out.println("Q2 \n");
		int[] array2 = new int[10];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = i * 4;
			System.out.println(array2[i]);
		}

		for (int i = 0; i < array2.length; i++) {
			// array2[i] = array2[i] * 10;
			array2[i] *= 10;
			System.out.println(array2[i]);
		}
		
	}

}
