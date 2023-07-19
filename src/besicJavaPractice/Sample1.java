package besicJavaPractice;

public class Sample1 {
	
	public static void demo1()
	{
		System.out.println("Hi I am demo1 from sample1 class");
	}
	

     public static void main(String[] args)
     {
    	 demo1();
    	 Sample.demo();
    	 Sample1 s=new Sample1();
    	 s.demo2();
    	 Sample s1=new Sample();
    	 s1.demo3();
     }
     
     public void demo2()
     {
    	 System.out.println("I am demo2 non-static method fromm sample2 class");
     }

}
