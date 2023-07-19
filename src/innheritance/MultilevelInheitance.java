package innheritance;

public class MultilevelInheitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grandmother gm=new Grandmother();
		gm.keys();
		
		Mother m=new Mother();
		m.keys();
		m.home();
		m.money();
		
		Son s =new Son();
		s.laptop();
		s.mobile();
		s.home();
		s.money();
		s.keys();
				

	}

}
