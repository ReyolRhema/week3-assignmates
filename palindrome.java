package week3day1;

public class palindrome
{

		public static void main(String[] args) {
			
			String name="malayalam";
			String rev="";
			
			char[] character= name.toCharArray();
			
			for(int i=character.length-1;i>=0;i--){
				rev=rev+character[i];}
	
				System.out.println(rev);
				
				if(name.equals(rev)) {
					System.out.println("is palindrome");
				}
					else {
						System.out.println("is not palindrome");
					}
		}}
				
			
		
	
			