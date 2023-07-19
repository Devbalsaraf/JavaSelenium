package besicJavaPractice;

public class VariableTypes {

	int a=20;
	static int b=10;
	
	public static void main(String[] args) {
		System.out.println("value of b "+b);
		VariableTypes vr=new VariableTypes();
		
		System.out.println("value of a "+vr.a);
		vr.display();
		VariableTest vt=new VariableTest();
		System.out.println("value of x is "+vt.x);
		System.out.println("value of y is "+VariableTest.y);
		

	}
	
	public void display()
	{
		int c=30;
		int a=100;
		System.out.println("value of a "+a);
		System.out.println("value of c "+c);
		System.out.println("value of b "+b);
	}

}
