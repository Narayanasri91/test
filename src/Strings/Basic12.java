package Strings;

public class Basic12 {
	public static void main(String[] args) {
		
		String str="Welcome Meena to Stackoverflow com";
		
		System.out.println(str.indexOf("come"));
		
		System.out.println(str.substring(8,str.indexOf("to")-1));
		
		String s1="This is Java Class";
		String[] arr1=s1.split(" ");
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.println(arr1[i]+" ");
		}
	}

}
