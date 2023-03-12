package week3day1;

public class oddindexToUpperCase
{
	public static void main(String[] args) {
		
		String word = "anything";
		 
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			if(i%2!=0) {
				char alpha = Character.toUpperCase(charArray[i]);
				System.out.print(alpha);}
			else {
				System.out.print(charArray[i]);
			}
			
					
					
				}
				
					
		
			}}
			
	