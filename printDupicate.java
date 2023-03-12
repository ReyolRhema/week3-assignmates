package week3.day2;

public class printDupicate
{
	public static void main(String[] args) {
		//print duplicate within the given int array
	//create a integer variable
	int[] num= {3,3,4,56,4,3,7,7};
	
	//3,7,4
	//iterate the values 0 to array length
	for (int i = 0; i < num.length; i++) {
		//iterate the values from 1 to array length
		for (int j = i+1; j < num.length; j++) {
			//use the if equals method to check the repeated numbers
			if (num[i]==num[j]) {
				//print the duplicates
				System.out.println(num[i]);
				
			}
		}
	}
	
	
	
}
}
