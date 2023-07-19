package thisSuperUse;

public class ThisUse {
	
	int a=100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisUse tu=new ThisUse();
		tu.display();

		
	}
	
	public void display()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
	}

}
