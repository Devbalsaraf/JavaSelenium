package controlStatements;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=100;
		if(marks>=60 & marks<=100)
		{
			System.out.println("Fist division");
		}
		else if(marks>=50 & marks<60) 
		{
			System.out.println("Second Division");
		}
		
		else if(marks>=40 & marks<50)
		{
			System.out.println("third division");
		}
		
		else if(marks>100)
		{
			System.out.println("Marks range is invalid, Please enter value between 1-100");
		}
		else
		{
			System.out.println("your are fail");
		}

	}

}
