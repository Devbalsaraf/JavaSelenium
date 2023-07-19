package besicJavaPractice;

import accessModifier.PrivateUse;

public class AccessModifier1 extends PrivateUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateUse pu=new PrivateUse();
		pu.add();
		//pu.sub();  --> default method can't be access from other package
		//pu.mul();  --> private method scope remains only within class
		PrivateUse.div();

	}

}
