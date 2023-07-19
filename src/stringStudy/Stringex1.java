package stringStudy;

public class Stringex1 {

	public static void main(String[] args) {
		//Methods--> Length(), start with, endsWith, charAt, indexOf, split, toUppercase, toLowercase,substring,
		
		String s="velocity";
		String m=new String("Deva Balsaraf");
		String n="Deva";
		String a="Balsaraf";
		String b=" ";
		
//		System.out.println(s.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(m.toLowerCase());
//		System.out.println(s.charAt(3));
//		System.out.println(s.startsWith("v"));
//		System.out.println(s.endsWith("t"));
//		System.out.println(m.indexOf('B'));
//		System.out.println(m.indexOf("Ba"));
//		System.out.println(m.equals(n));
//		System.out.println(m.equalsIgnoreCase(n));
		System.out.println(a==n);
		System.out.println(m.contains("Deva"));
		System.out.println(n.concat(a));
		System.out.println(s.isEmpty());
		System.out.println(b.isBlank());
		System.out.println(m.substring(4));
		System.out.println(m.substring(5,8));
		//System.out.println(m.substring(-2,2));
		System.out.println(m.replace("Deva", "Devanand"));
		
		
		
		
		
		
		
		
		

	}

}
