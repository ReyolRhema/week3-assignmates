package week3.day2;

public class printDupicate
{
	public static void main(String[] args) {
	
	int[] num= {3,3,4,56,4,3,7,7};
	
	//3,7,4
	//iterate the values 0 to array length
	for (int i = 0; i < num.length; i++) {
		
		for (int j = i+1; j < num.length; j++) {
			
			if (num[i]==num[j]) {
				System.out.println(num[i]);
				
			}
		}
	}
	
	
	
}
}