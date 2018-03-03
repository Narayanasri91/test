package Strings;

public class Basic9 {

	public static void main(String[] args) {
		
		String s1="JavaDeveoper";
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.contains("Dev"));
		System.out.println("DA".compareTo("A"));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		char[] chars= s1.toCharArray();
		String s2="";
		for(int i=chars.length-1;i>=0;i--)
		{
			s2=s2+chars[i];
		}
		System.out.println(s2);

		String s3="Jack And Jill";
		
		char[] chars1=s3.toCharArray();
		
		for(int i=0;i<chars1.length-1;i++)
		{
			//print char in array
			System.out.print(chars[i]+"\t");
			
			//print unicode value of the char
			
			System.out.println((int)chars[i]+"\t");
			
			//print the next char of present char
			
			System.out.println((char)(chars[i]+1)+"\t");
			System.out.println(++chars[i]);
		}
		
		

	}

}
