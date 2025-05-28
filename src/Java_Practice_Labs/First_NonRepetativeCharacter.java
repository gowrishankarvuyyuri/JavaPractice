package Java_Practice_Labs;

public class First_NonRepetativeCharacter {

	public static void main(String[] args) {
		
		String string = "Malayalam";
		string = string.toLowerCase();
		
		for(char ch : string.toCharArray()) {
			
			if(string.indexOf(ch) == string.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}

	}

}
