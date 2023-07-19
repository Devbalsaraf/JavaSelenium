package constructor;

public class ConstructorStudy {
	
	int a;
	int b; 
	int c;
	
	public ConstructorStudy()
	{
		a=10;
		b=29;
		c=40;
	}
	
	public ConstructorStudy(int a)
	{
		this.a=a;
	}

	public ConstructorStudy(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public ConstructorStudy(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	public static void main(String[] args) {
		
		
		ConstructorStudy cs=new ConstructorStudy();
		cs.add();
		ConstructorStudy cs1=new ConstructorStudy(100);
		cs1.add();
		
		ConstructorStudy cs2=new ConstructorStudy(100,200);
		cs2.add();
		
		ConstructorStudy cs3=new ConstructorStudy(100,200,300);
		cs3.add();
		

	}
	
	public void add()
	{
		int sum=a+b+c;
		System.out.println("addition is "+sum);
		
	}

}
