package Strings;

import java.util.Arrays;

public class StringExercises {

	public static void main(String[] args) {
		
		String str1 = "gowri";
		String str2 = "Shankar";
		String str3 = "Vuyyuri";
		String str4 = " Gowri Shankar ";
		String str5 = "Gowri";
		String str6 = "Welcome Gowri Shankar Vuyyuri!, Heartly Welcome you Gowri again";
		
		System.out.println(str1.length()); //length of a String
		
		System.out.println(str1.concat(str2)); //concatinating of two Strings
		System.out.println(str1.concat(str2).concat(str3)); //concatinating of three Strings
		
		System.out.println(str4.trim()); //removes left and right white spaces
		
		System.out.println(str3.charAt(5)); //returns the character at index point
		
		System.out.println(str4.trim().contains(str1)); //prints true if str1 present in str4 - case sensitive
		
		System.out.println();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str5)); //comparing the strings - case sensitive
		System.out.println(str1.equalsIgnoreCase(str5)); 
		
		System.out.println();
		
		System.out.println(str6.replace("Gowri", "gowri")); //replaces a word/character in a given string
		System.out.println(str6.replace('W', 'w'));
		
		System.out.println();
		
		System.out.println(str4.substring(7)); // extracting a portion of a String
		System.out.println(str4.substring(1, 6));
		
		System.out.println();
		
		System.out.println(str1.toLowerCase()); // to change the sign of a word/s.
		System.out.println(str1.toUpperCase());
		
		System.out.println();
		
		String mailid = "gowrishankarvuyyuri@yahoo.com";
		String[] split = mailid.split("@"); // spliting a string into two chunks
		System.out.println(Arrays.toString(split));
		String[] str8 = str4.trim().split(" ");
		System.out.println(Arrays.toString(str8));
		
		
	}

}
