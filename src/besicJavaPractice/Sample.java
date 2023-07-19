package besicJavaPractice;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Main method is starting");
		demo();
		Sample1.demo1();

	}
	
	public static void demo()
	{
		System.out.println("I am static demo method");
		
	}
	
	public void demo3()
	{
		System.out.println("I am non-static demo3 from sample class");
	}

}

