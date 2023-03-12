package week3day1;

public class palindrome
{

		public static void main(String[] args) {
			// to check that given string is palindrome or not
			String name="malayalam";
			String rev="";
			// create a string rev  variable
			//creata a palindrome string variable as (malayalam)
			char[] character= name.toCharArray();
			//change the variable to character array
			for(int i=character.length-1;i>=0;i--){
				rev=rev+character[i];}
	                  /initialize a for loop 
				  // i = -1 to to start loop and i lesser than zero , i decrement
				System.out.println(rev);
				//use if equals method to check it is palindrome or not
				if(name.equals(rev)) {
					System.out.println("is palindrome");
				}
					else {
						System.out.println("is not palindrome");
					}
		}}
				
			
		
	
			
