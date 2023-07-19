package besicJavaPractice;

public class MethodsStudy {

	public static void main(String[] args) {
		// methods: it is a block of code which runs only when it is called. we can pass parameter into methods. 
		// methods are use to perform specific task.. also called as function.
		// main method--> compiler starts execution from main method
		System.out.println("main method started");
		add();
		add(10,20);
		//add(10,20,30);
		MethodsStudy ms=new MethodsStudy();
		ms.add(10,20,30);
		
		

	}
	
	public static void add()
	{
		System.out.println("sum of no:");
	}
	
	public static void add(int a, int b)
	{
		System.out.println("sum of no:" +(a+b));
	}
	
//	public static void add(int a, int b, int c)
//	{
//		
//		System.out.println("sum of no:" +(a+b+c));
//	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("sum of no:" +(a+b+c));
	}

}
