package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DeleteDuplicateFromArrayUsingHashSet {

	public static void main(String[] args) {
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
