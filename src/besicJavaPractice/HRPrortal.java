package besicJavaPractice;

public class HRPrortal {

	public static void main(String[] args) {
		Employee rahul=new Employee();
		rahul.empid=101;
		rahul.sal=12356;
		rahul.rm="ramesh t";
		 
		Employee ajit=new Employee();
		ajit.empid=12345;
		ajit.sal=40235;
		ajit.rm="kajal agrval";
		
		ajit.employeeinfo();
		rahul.employeeinfo();
	}

}
