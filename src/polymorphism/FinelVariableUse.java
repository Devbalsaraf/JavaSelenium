package polymorphism;

public class FinelVariableUse {

	int a=10;
	final int b=20;
	
	public static void main(String[] args) {



	}

	public void add()
	{
		a=a+10;
		System.out.println(a);
		//b=b+10; can't update value of final variable
		
	}
}
