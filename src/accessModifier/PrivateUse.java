package accessModifier;

public class PrivateUse {
	int a=10;
	public int b=20;
	private int c=30;
	protected static int d=40;
	
	public static void main(String[] args) {
		
		PrivateUse pu=new PrivateUse();
		pu.add();
		pu.sub();
		pu.mul();
		div();
		
		System.out.println(pu.a);
		System.out.println(pu.b);
		System.out.println(pu.c);
		System.out.println(d);
		
		
	}

	public void add()
	{
		int a, b=1,c=2;
		a=b+c;
		System.out.println("sum "+a);
	}
	
	void sub()
	{
		int a, b=1,c=2;
		a=c-b;
		System.out.println("substraction "+a);
	}
	
	private void mul()
	{
		int a, b=1,c=2;
		a=b*c;
		System.out.println("Mul "+a);
	}
	
	protected static void div()
	{
		int a, b=1,c=2;
		a=c/b;
		System.out.println("Division "+a);
	}

}
