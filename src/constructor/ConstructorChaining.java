package constructor;

public class ConstructorChaining {
	
	public ConstructorChaining()
	{
		//this(20);
		this("Dva");
		
		
	}
	
	public ConstructorChaining(int a)
	{
		System.out.println("value of a "+a);
	}
	
	public ConstructorChaining(String s)
	{
		System.out.println("value of string is "+s);
	}
	

	public static void main(String[] args) {
		
		ConstructorChaining cc=new ConstructorChaining();
		

	}

}
