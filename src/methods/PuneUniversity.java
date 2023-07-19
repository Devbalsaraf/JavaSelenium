package methods;

public class PuneUniversity {

	public static void main(String[] args) {
		// Name, PNR, Course, Grade
		PuneUniversity pu=new PuneUniversity();
		pu.studentinfo();
		pu.studentinfo("Deva", "PU235", "Electrinics", 'B');
		pu.studentinfo("Keshav","PU896", "Mechanical", 'C');

	}
	
	public void studentinfo()
	{
		String name="Bhushan";
		String PNR="PU123";
		String course="BE";
		char grade='A';
		
		System.out.println("====================================");
		System.out.println("Students name is "+name);
		System.out.println("Students PNR number is "+PNR);
		System.out.println("Students course is "+course);
		System.out.println("Students grade is "+grade);
		System.out.println("----------------------------------------");
		
		
	}
	
	public void studentinfo(String name, String PNR, String course, char grade)
	{
		System.out.println("====================================");
		System.out.println("Students name is "+name);
		System.out.println("Students PNR number is "+PNR);
		System.out.println("Students course is "+course);
		System.out.println("Students grade is "+grade);
		System.out.println("----------------------------------------");
		
	}
	
	

}
