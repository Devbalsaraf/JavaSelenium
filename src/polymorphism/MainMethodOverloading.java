package polymorphism;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("main method with string[]");

		main();
		main("Aman");
	}
	
	public static void main(String s) {
		System.out.println("Main method with string arg" +s);
	}
	
	public static void main() {
		System.out.println("main method with no args");
	}

}
