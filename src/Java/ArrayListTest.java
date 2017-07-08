package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
/*	public static void printList(List<String> words){
		for(int i =0 ; i<words.size() ; i++){
			System.out.println("Words["+ i+"] :" + words.get(i));
		}
	}*/

	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("My");
		System.out.println(words);
		
		// Add item at location
		words.add(1, "name");
		words.add(2, "neeraj");
		
		 System.out.println("Print Complete Array List   :" + words);
		 System.out.println("Print 1st Element in ArrayList    :"+ words.get(1));
		 
		 
		for(int i =0 ; i<words.size() ; i++){
			System.out.println("Words["+ i+"] :" + words.get(i));
		}
		
		
		// Iterate using Iterator.
		
		Iterator<String> iterator = words.iterator();
			while(iterator.hasNext()){
				String word = iterator.next();
				// Printing using Iterator
				System.out.println("Printing using Iterator     :"+word);
			}
			
		// Iterate using enhanced for loop
			for (String word : words){
				System.out.println("Using enhanced for loop     :" + word);
			}
			
		
	}

}
