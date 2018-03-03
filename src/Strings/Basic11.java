package Strings;

public class Basic11 {
	
	public static void main(String[] args) {
		
		System.out.println(new String("Hello").length());
		System.out.println("Bangalore".length());
		
		String s4="   hello   ";
		System.out.println(s4.length());
		s4=s4.trim();
		System.out.println(s4.length());
	//alternative way
		System.out.println(s4.trim().length());
		
		String s1="JavaDeveloper";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(4,s1.length()-2));
		
	// 4th is index and 11 is position
		System.out.println(s1.substring(4,9));
		
	}

}
