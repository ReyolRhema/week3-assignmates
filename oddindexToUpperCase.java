package week3day1;

public class oddindexToUpperCase
{
	public static void main(String[] args) {
		//change only the odd index to uppercase
		String word = "anything";
		 //create a string and give a variable 
		//output:(aNyThInG)
		//initialize  a character array and change variable to chararray
		char[] charArray = word.toCharArray();
		create a for loop
		for (int i = 0; i < charArray.length; i++) {
			//i=0, i (0) modular 2 is 0 
			if(i%2!=0) {
				char alpha = Character.toUpperCase(charArray[i]);
			//if i modulaar 2 is zero satisfies the condition then change it to uppercase
				System.out.print(alpha);}
			//if the condition not satisfies else print as its
			else {
				System.out.print(charArray[i]);
			}
			
					
					
				}
				
					
		
			}}
			
	
