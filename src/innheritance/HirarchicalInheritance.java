package innheritance;

public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother m=new Mother();
		m.money();
		m.home();
		
		Son s=new Son();
		s.mobile();
		s.laptop();
		s.money();
		s.home();
		
		Daughter d=new Daughter();
		d.money();
		d.home();
		d.jewl();
		

	}

}
