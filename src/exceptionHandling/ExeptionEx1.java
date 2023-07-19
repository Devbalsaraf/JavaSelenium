package exceptionHandling;

public class ExeptionEx1 {

	public static void main(String[] args) {
		// Exception--event that disrupt normal flow of program. it is an object which is thrown at runtime
		// checked exception-->
		
		int a=10;
		System.out.println("first line");
		try 
		{
			int div=10/0;
		} 
		catch (Exception e) 
		{
			System.out.println("exception got handled");
			
		}
		
		System.out.println("second line");
		//System.out.println(div);

	}

}
