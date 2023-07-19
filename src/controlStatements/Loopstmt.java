package controlStatements;

public class Loopstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int m=1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		for(int i=5;i>0;i--)
		{
			System.out.println(i);
		}
		
		while(a<=10)
		{
			
			System.out.println(a);
			a=a+2;
		}
		
		do
		{
			System.out.println("-------------------");
			System.out.println(m);
			m++;
		}
		while(m>=10);
	}

}
