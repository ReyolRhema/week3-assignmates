package week3.day2;

import java.util.Scanner;

public class reverseTheStrting {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter your name");
		 String nextLine=scan.nextLine();
		 
	 String name="reyol";
	 char[] character1 = name.toCharArray();
	 for (int i=character1.length-1;i>=0;i--) {
		 System.out.println(character1[i]);}
		
	 char[] character11 = nextLine.toCharArray();
	 for (int i1=character11.length-1;i1>=0;i1--) {
		 System.out.println(character11[i1]);
		
	}

}}
