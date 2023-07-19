package interfaceStudy;

public interface Father {
	
	void money();
	void propery();
	default void car()
	{
		System.out.println("Fathers car");
	}
	static void test()
	{
		System.out.println("Fathers test");
	}
	


}
