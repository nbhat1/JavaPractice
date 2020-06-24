/**
 * 
 */
package com.testing.practice.old;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Neeraj
 *
 */
public class ConvertArrayToArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		String[] list = {"Neeraj", "Kumar", "Bhatnagar"};
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(list));
		
		for(int i =0;i<nameList.size();i++){
			System.out.println(nameList.get(i));
		}

	}

}
