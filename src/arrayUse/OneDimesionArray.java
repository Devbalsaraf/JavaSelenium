package arrayUse;

import java.util.Arrays;

public class OneDimesionArray {

	public static void main(String[] args) {
		//array is data structure use to store homogenious data 
		// arrays are not growable in nature
		// It needs to defined with capacity
		
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=40;
		a[3]=30;
		a[4]=60;
		//a[5]=50;
		
		System.out.println(a[0]);
		System.out.println(a.length);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("--------------------------");
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println("------------------------");
		
		String[] s= {"Aman", "Radha", "Krishna"};
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
	}

}
