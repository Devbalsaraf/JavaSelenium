package collectionStudy;

import java.util.HashSet;

public class HashSetUse {

	public static void main(String[] args) {
		// Set-->Duplicate elements aren't allowed
		// only one Null value is allowed(except tree set)
		// order of insertion is random
		// No default capacity
		// DS-Hashtable
		// storage type-> Hash table
		// Best choice-->To remove duplicate elements when order of insertion is random
		
		HashSet h=new HashSet();
		h.add(123);
		h.add('A');
		h.add("Kimaya");
		h.add(123.5f);
		h.add(123);
		h.add(null);
		
		
		System.out.println(h);

	}

}
