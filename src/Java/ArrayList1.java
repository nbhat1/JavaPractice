package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("My");
		list.add("Name");
		list.add("Neeraj");
	
		list.addAll(list);
		
		System.out.println(	list.get(1));
		
		for(int i=0;i<list.size();i++){
			System.out.println(	list.get(i));
			System.out.println(	list.get(i));
		}
		
		Iterator<String> itr = list.iterator();
		System.out.println("Using Iterator");
		while(itr.hasNext()){
			
			String word = itr.next();
			
			System.out.println(word);
		}
		

	}

}
