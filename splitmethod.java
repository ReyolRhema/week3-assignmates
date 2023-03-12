package week3.day2;

public class splitmethod {
	public static void main(String[] args) {
		
		String text ="Amazon has 20,000 employees in chennai";
		
		String replaceAll= text.replaceAll("[^0-9]" ,"");
		System.out.println(replaceAll);
	}

}
