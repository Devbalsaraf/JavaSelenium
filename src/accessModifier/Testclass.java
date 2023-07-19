package accessModifier;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateUse pu=new PrivateUse();
		pu.add();
		pu.sub();
		//pu.mul();
		PrivateUse.div();
		System.out.println(pu.a);
		System.out.println(pu.b);
		System.out.println(PrivateUse.d);
		

	}

}
