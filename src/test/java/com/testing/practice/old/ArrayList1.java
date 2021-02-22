package com.testing.practice.old;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayList1 {

	@Test
	public static void testArrayList() {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("My");
		list.add("Name");
		list.add("Neeraj");
	
		//list.addAll(list);
		
		System.out.println("Element in list at first place is " + 	list.get(0));
		
		for(int i=0;i<list.size();i++){
			System.out.println(	"Element at location " + i + "\n" + list.get(i));
		}
		
		Iterator<String> itr = list.iterator();
		System.out.println("Using Iterator");
		while(itr.hasNext()){
			
			String word = itr.next();
			
			System.out.println(word);
		}
		

	}

}
