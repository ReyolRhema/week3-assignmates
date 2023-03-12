package week3day1;

public class intersection {

	 public static void main(String[] args) {
		 //going to find the intersection within the given int variables
		 //create a two int array with some same numbers and some different ones
		 //output:(80,44,77)
			 int[] marks1 = {30,80,11,44,46,77};	 
		int[]  marks2=  {100,90,80,44,92,77};
		 //create a for loop twice  to check wheather the int variables matches within the two sets
		for (int i = 0; i < marks1.length; i++) {
			for (int j = 0; j < marks2.length; j++) {
				if(marks1[i]==marks2[j]) {
					//give the two sets name in if equals to check what are the numbers are interssect
					System.out.println(marks2[j]);
				//print any one variable 
				}
				
			}
		}
	}
	}
