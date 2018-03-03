package Strings;

public class Basic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		System.out.println(s1.length());
		System.out.println(s1.concat("Hello"));
		System.out.println(s1);
	//	=========================================================
		
		String s2=new String();
		System.out.println(s2.isEmpty());//True
		
		s2=s2.concat("Bangalore");
		System.out.println(s2.isEmpty());//false
		
		System.out.println(s1.contains("Devre"));//False
		
		System.out.println(s1.equals(s2));//f
		System.out.println(s1.equals(null));//f
		System.out.println(s1.equals("Hello"));//t
		
		s1.equals(new String("Hello"));
		System.out.println(s1.equals(s1));//
		
		System.out.println("Hello".equals("Hello"));
		System.out.println(new String("Hello").equals(new String("Hello")));
		
		System.out.println(" ".equals(" "));
		s1="Hellohello";
		System.out.println(s1.equalsIgnoreCase("Hello"));
		
		
		
		
		
				
		
		

	}

}
