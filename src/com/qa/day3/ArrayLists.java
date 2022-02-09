package com.qa.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// Arrays are fixed length
		// ArrayLists are dynamic
		
		// {2,3,3}
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.isEmpty());
		
		arrayList.set(1, 84);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println("\n================================== \n");
		System.out.println(arrayList);
//		arrayList.clear();
//		System.out.println(arrayList.toString());
		System.out.println("\n================================== \n");
		
		for(int i = 0; i < arrayList.size(); i++) {						
			System.out.println(arrayList.get(i));
		}
		
		
		List<Integer> copied = new ArrayList<>();
		copied.add(1);
		copied.add(2);
		copied.add(3);
		
		Collections.copy(copied, arrayList);
		
		System.out.println(copied);
		
		
		for(Integer num : copied) {
			System.out.println(num);
		}
		
		
	}

}
