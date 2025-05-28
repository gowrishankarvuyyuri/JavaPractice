package Java_Practice_Labs;

public class Capitlized_First_Word {

	public static void main(String[] args) {
		
		String string = "gowri shankar vuyyuri";
		StringBuilder result = new StringBuilder();
		
		for(String stringSplit : string.split(" ")) {
			char []charArray = stringSplit.toCharArray();
			
			charArray[0] = Character.toUpperCase(charArray[0]);
			result.append(new String(charArray)).append(" ");

		}
		System.out.println(result);
	}

}
