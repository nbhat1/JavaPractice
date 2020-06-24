package com.testing.practice.old;

public class FindLargestNymberinArray {

	public static void main(String[] args) {

		Integer[] list = {2,54,43,67,23};
		int length = list.length;
		int large = list[0];
		int small = list[0];
		int sum = 0;
		for (int i = 0;i<length;i++){
			if (list[i] >large){			
				large = list[i];
			}	else if(list[i] < small){
				small = list[i];
				
			}
			
			
		}	
		
		for (int i = 0;i<length;i++){
			sum += list[i];
		}
		System.out.println("total is =" + sum);
		System.out.println("largest number is =" + large);
		System.out.println("Smallest number is =" + small);
	}
	
}
