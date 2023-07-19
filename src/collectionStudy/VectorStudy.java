package collectionStudy;

import java.util.Enumeration;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(1);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println(v.capacity());
		

		
	}

}
