package collectionStudy;

import java.util.TreeSet;

public class TreesetUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(12);
		ts.add(10);
		ts.add(11);
		ts.add(16);
		ts.add(14);
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	

	}

}
