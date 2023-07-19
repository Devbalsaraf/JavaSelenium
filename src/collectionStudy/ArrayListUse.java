package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUse {

	public static void main(String[] args) {
		// Collection(I)-->List(I)-->ArrayList, Vector, LinkedList (c)
		//List-->Properties
		//Duplicates are allowed, Null values are allowed, Order of insertion is maintained, 
		
		// ArrayList--> Default cap=10, IC=(c*1.5)+1, DS=resizable, 
		// best choice-retrival operation   worst choice-Manipulation operation
		
		ArrayList al= new ArrayList();
		al.add("anmol");
		al.add(12);
		al.add(12);
		al.add('A');
		al.add(25.5f);
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(3));
		al.add(1,"Kartik");
		System.out.println(al);
		al.set(2, true);
		System.out.println(al);
		System.out.println(al.indexOf("Kartik"));
		
//		ListIterator lt = al.listIterator();
//		while(lt.hasNext())
//		{
//			System.out.println(lt.next());
//		}
		
//		Iterator it = al.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		for(int i=0;i<=al.size()-1;i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println(al.contains("Anmol"));
		System.out.println(al.isEmpty());
		al.remove("anmol");
		System.out.println(al);
		
		

	}

}
