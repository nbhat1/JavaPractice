package com.testing.practice.old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Neeraj");
		list1.add("Kumar");
		list1.add("Bhatnagar");
		
		Collections.sort(list1);

		for(int i=0; i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
	}

}
