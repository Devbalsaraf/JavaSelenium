package abstractClass;

public class Subclass extends Abstract1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Subclass sc=new Subclass();
		sc.test1();
		sc.test2();

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("this is implemented in subclass");
		
	}

}
