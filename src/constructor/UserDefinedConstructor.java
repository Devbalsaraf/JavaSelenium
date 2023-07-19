package constructor;

public class UserDefinedConstructor {
	int a;
	int b;
	
	public UserDefinedConstructor()
	{
		a=100;
		b=200;
	}

	public static void main(String[] args) {

		UserDefinedConstructor ud=new UserDefinedConstructor();
		ud.add();
		ud.sum();
		

	}
	
	
	public void add()
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public void sum()
	{
		int sub=a-b;
		System.out.println("Substraction is "+sub);
	}

}
