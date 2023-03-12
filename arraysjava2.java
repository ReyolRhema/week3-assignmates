package week3day1;

import java.util.Arrays;

public class arraysjava2 {
	public static void main(String[] args) {
		//create a string variable
		String[] biodata= {"REYOL RHEMA"};
		//iterate the values from 0 to array length
		for (int i = 0; i < biodata.length; i++) {
		System.out.println(biodata[i]);
		}
			
	int regNo=1165;
	System.out.println("regitration no " + regNo);
		
	long mobileNo=	987654321l;
	System.out.println("contact " + mobileNo);
	
	int[] marks= {90,80,70,};
	System.out.println("python " + marks[1]);
	System.out.println("java " + marks[2]);
	System.out.println("c# " + marks[0]);
	//try ascending
	int[] ascend= {9,7,5,3,1};
	Arrays.sort(ascend);
	for (int i = 0; i < ascend.length; i++) {
	System.out.println(ascend[i]);}
			
	}

}
