package Strings;

public class Basic10Prgrm4 {

	public static void main(String[] args) {
		
		String s1="JavaDeveloper";
		String s2="";
		
		char[] chars=s1.toCharArray();
		for(int i=0;i<=chars.length-1;i++)
		{
		  s2=s2+chars[i];	
		}
		System.out.println(s2);
		
		System.out.println("Reverse a string in array");
		
		for(int i=chars.length-1;i>=0;i--)
		{
			System.out.print(chars[i]);
		}
		
		System.out.println();
		System.out.println("Uniode of each character");
		
		for(int i=0;i<chars.length-1;i++)
		{
			System.out.print(chars[i]+"\t");
			System.out.println((int)chars[i]);
		}
		
		System.out.println();
		System.out.println("Printing next char of the char EX: A--B J--K");
		
		for(int i=0;i<chars.length-1;i++)
		{
			System.out.print(chars[i]+"\t");
			System.out.println(++chars[i]);
		}
	}

}
