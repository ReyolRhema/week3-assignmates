package week3.day2;

import java.util.Arrays;

public class secondLargestNo {
	public static void main(String[] args) {
		//create a integer array 
		//to find the second largest no within the given int array variable
		int[] num= {11,2,3,12,10};
		//use arrays . sort to accend the variables
		Arrays.sort(num);
		//iterate the values from 3 to array lenth -1
		 for (int i = 3; i < num.length-1; i++) {
			 //print
		System.out.println(num[i]);}
		 
		 //second smallest no
		 
		 int[] value= {10,9,11,30,72};
		 Arrays.sort(value);
	     int min= value[0];
		 int max=value[value.length-4];
		 System.out.println(max);
	}
}
