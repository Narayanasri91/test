package Strings;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Basic5 {

	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Developer";
		String s3=s1+s2;
		
		System.out.println("S3= "+s3);
		
		String s4="JavaDeveloper";
		
		System.out.println("s4 "+s4);
		
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		
		String s5="Java"+"Developer";
		System.out.println(s3==s5);//false
		System.out.println(s4==s5);//true
		
		String s6=s1+"Developer";
		System.out.println(s3==s6);//false
		System.out.println(s4==s6);//false
		System.out.println(s4.equals(s6));//true
		System.out.println(s3.equals(s6));
		System.out.println(s5.equals(s3));
		
		
		

	}

}
