package week3.day2;
public class printeachcharacter {
	public static void main(String[] args) {
		
		//declare a string 
		String text ="testleaf";
		//convert string into character array
		
		char[] characters=text.toCharArray();
		//iterate the values from 0 to array length
		
		for (int i = 0; i < characters.length; i++) {
			//print each character
			System.out.println(characters[i]);
		}
	}

}
