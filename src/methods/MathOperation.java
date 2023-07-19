package methods;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		MathOperation mo=new MathOperation();
		mo.sub();
		Test.div();
		Test t=new Test();
		t.mul();

	}
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum of number is "+sum);
	}

	public void sub()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("Subtraction of number is "+sub);
	}
}
