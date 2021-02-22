package com.testing.practice.old;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class DeleteDuplicateFromArrayUsingHashSet {

	@Test
	public static void deleteDuplicate() {
		// TODO Auto-generated method stub		
		Integer [] list = {1,2,3,2,4};
		Set<Integer> myset = new HashSet<Integer>();
		Collections.addAll(myset, list);
		Iterator<Integer> itr = myset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
