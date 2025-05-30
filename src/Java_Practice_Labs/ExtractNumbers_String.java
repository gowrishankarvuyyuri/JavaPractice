package Java_Practice_Labs;

public class ExtractNumbers_String {

	public static void main(String[] args) {
		
		String string = "Order123Test456";
		StringBuffer newString = new StringBuffer();
		
		for(char ch : string.toCharArray()) {
			if(Character.isDigit(ch)) {
				newString.append(ch);
			}
		}
		System.out.println(newString);

	}

}
