package thisSuperUse;

public class B extends A {
	int a=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.display();

	}
	
	public void display()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}

}
