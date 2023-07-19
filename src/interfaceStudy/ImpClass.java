package interfaceStudy;

public class ImpClass implements MyInterface {
	
	
	public static void main(String[] args) {
		ImpClass imp=new ImpClass();
		imp.test1();
		imp.test2();
		imp.test3();
	}

	@Override
	public void test1() {
		System.out.println("test1 completed in this class");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 completed in this class");

		
	}
	
	public void test3() {
		System.out.println("My own mwthod");
	}

}
