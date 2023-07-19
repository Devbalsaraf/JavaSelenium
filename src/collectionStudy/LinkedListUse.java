package collectionStudy;

import java.util.LinkedList;

public class LinkedListUse {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(12.5f);
		ll.add('A');
		ll.add("Amar");
		ll.add(123);
		ll.add(123);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		ll.addFirst("Deva");
		ll.addLast("balsaraf");
		System.out.println(ll);
		ll.remove(6);
		System.out.println(ll.size());
		System.out.println(ll.contains("Deva"));
		System.out.println(ll.get(5));
		ll.set(5,420);
		System.out.println(ll);
		ll.remove(5);
		System.out.println(ll);
		
		
		

	}

}
