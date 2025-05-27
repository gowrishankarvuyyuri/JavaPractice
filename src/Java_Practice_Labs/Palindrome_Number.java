package Java_Practice_Labs;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		//Approach1 Using StringBuffer/Builder
		String string1 = "Malayalam";
		StringBuffer string2 = new StringBuffer(string1);
		
		String string3 = string2.reverse().toString();
		System.out.println((string1.equalsIgnoreCase(string3))? "Palindrome" : "Not a Palindrome");

		
		
		//Approach2 using for-loop and char[]
		String string = "Malayalam";
		char[] str = string.toCharArray();
		
		for(int i=0, j=string.length()-1; i<j; i++,j--) {
			char temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
		
		String strinng = String.valueOf(str);
		System.out.println((string.equalsIgnoreCase(strinng))? "Palindrome" : "Not a Palindrome");
		
	}

}
