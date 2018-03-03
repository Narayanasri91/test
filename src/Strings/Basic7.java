package Strings;

public class Basic7 {

	public static void main(String[] args) {
		
		String s1="JavaDeveloper";
		
		System.out.println(s1.indexOf('D'));//4
		System.out.println(s1.indexOf("Dev"));//4
		System.out.println(s1.indexOf('e'));//5
		System.out.println(s1.indexOf('Z'));//-1
		System.out.println(s1.lastIndexOf('e'));
		//System.out.println(s1.indexOf('4'));
		System.out.println("===================");
		System.out.println(s1.indexOf('e', 3));
		System.out.println(s1.indexOf('e', 6));
		System.out.println(s1.indexOf('e', 8));
		
		System.out.println("Replace all occurence");
		System.out.println("======================");
		
		System.out.println(s1.replace("e", "E"));
		System.out.println(s1.replaceAll("a", "A"));
		
		System.out.println("====================================");
		
		System.out.println(s1.charAt(0));//J
		System.out.println(s1.length()-1);//12
		
		char ch=s1.charAt(1);
		System.out.println(ch);//a
		
		s1="JackAndJill";
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
		
	}

}
