package casting;

public class NonPrimitiveCasting {

	public static void main(String[] args) {
		// Converting one type of class into other type of class
		//Assigning sub class properties into super class
		// Perform inheritance operation-->
		
		A a=new A();
		a.test1();
		B b=new B();
		b.test1();
		b.test2();
		
		A a1=new B();
		a1.test1();
		//a1.test2();

	}

}
