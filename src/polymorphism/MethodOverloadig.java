package polymorphism;

public class MethodOverloadig {

	public static void main(String[] args) {
		MethodOverloadig mo=new MethodOverloadig();
		mo.add();
		mo.add(100,200);

	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}

}
