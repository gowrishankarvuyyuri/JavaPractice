package Java_Practice_Labs;

import java.util.Arrays;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str = "Gowri Shankar Vuyyuri";
		
		//characters
		/*
		char[] chr = str.toCharArray();
		
		for(int i = 0, j = chr.length-1; i < j; i++, j--) {
			char temp = chr[j];
			chr[j] = chr[i];
			chr[i] = temp;
		}
		str = String.valueOf(chr);
		System.out.println(str);
		*/
		
		
		
		//String[] Reverese
		String[] newString = str.split(" ");
		for(int i = 0, j = newString.length-1; i < j; i++, j--) {
			String temp = newString[j];
			newString[j] = newString[i];
			newString[i] = temp;
		}
		System.out.println(Arrays.toString(newString));
		
		for(String extractString : newString) {
			StringBuilder string = new StringBuilder(extractString);
			string.reverse();
			str = string.toString();
			System.out.print(str + " ");
		}
	}

}
