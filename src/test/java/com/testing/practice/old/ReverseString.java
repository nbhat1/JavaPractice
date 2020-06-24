package com.testing.practice.old;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String S = "ABCD";
		char[] charArray = S.toCharArray();
		System.out.println(charArray.length);
		for (int i = charArray.length -1 ; i>=0 ; i--){
			System.out.println(charArray[i]);
		}*/
		
		String str = "MyString";
		char[] arr = str.toCharArray();
		for(int i = arr.length-1; i>=0; i--){
			System.out.print(arr[i]);
		}
	}
}