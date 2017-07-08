package Java;

import org.testng.annotations.Test;

public class CheckElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] list = {"Paris","Delhi","Newyork"};
		
		//arrayList(list, "Paris");
		System.out.println(arrayList(list, "Paris"));

	}
	
	
	public static boolean arrayList(String[] list, String targetValue){
		
		for(String s:list){
			if(s.equals(targetValue))
				//System.out.println(targetValue);
				return true ;
		}
		
		return false;
		
		
	}
}
