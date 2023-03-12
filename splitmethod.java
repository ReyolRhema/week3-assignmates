package week3.day2;

public class splitmethod {
	public static void main(String[] args) {
		//implement a splitmethod in the given string vraiable
		//create a string and a variable 
		String text ="Amazon has 20,000 employees in chennai";
		//output:20000(takes only the numbers in the string variable)
		String replaceAll= text.replaceAll("[^0-9]" ,"");
		//we only split the numbers so give digits 0 to 9 within the array
		System.out.println(replaceAll);
	}

}
