package interfaceStudy;

public class Child implements Father,Mother{

	@Override
	public void look() {
		System.out.println("child look");
		
	}

	@Override
	public void receipe() {
		System.out.println("child receipe");
		
	}

	@Override
	public void money() {
		System.out.println("child money");
		
	}

	@Override
	public void propery() {
		System.out.println("child property");
		
	}

	@Override
	public void car() {
		Mother.super.car();
		Father.super.car();
		
	}

	

}
