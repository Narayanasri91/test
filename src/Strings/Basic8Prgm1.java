package Strings;

public class Basic8Prgm1 {

	public static void main(String[] args) {
		String s1="Jack And Jill";
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
		
		System.out.println();
		System.out.println("Printing in reverse");
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println("=========********============");
		
		System.out.println("revese a string");
		String s3="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s3=s3+s1.charAt(i);
		}
		System.out.print(s3);
		
		System.out.println("=========********============");
		
		String s4="Hi how are You";
		String s5="";
		
		for(int i=s4.length()-1;i>=0;i--)
		{
			s5=s5+s4.charAt(i);
			}
		System.out.println(s5);
	
	}

}
