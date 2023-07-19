package interfaceStudy;

public interface Mother {
	
	void look();
	void receipe();
	default void car()
	{
		System.out.println("Mothers car");
	}
	static void test()
	{
		System.out.println("static test method from mothers class");
	}

}
