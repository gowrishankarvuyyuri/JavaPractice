package Java_Strings;

import java.util.Arrays;

public class String_Operations {

	public static void main(String[] args) {
		
		//string.length()		-)		returns length of the string
		String str = "Gowri Shankar";
		int length = str.length();
		
		
		//string.indexOf();		-)		returns the index value of char/String
		String str2 = "Gowri Shankar Vuyyuri";
		int index1 = str2.indexOf('a');
		int index11 = str2.lastIndexOf('a');
		int index2 = str2.indexOf("hankar");
		
		
		//String.join(",",string1,string2,...)	-)	joins the n number of strings with delimiter
		String str3 = "Gowri";
		String str4 = String.join(" ", str3, "Shankar", "Vuyyuri");
		
		
		//string.toCharArray()	-)		converts String to Character Array	
		String str5 = "Gowri Shankar";
		char ch[] = str5.toCharArray();
		
		
		//string.concat(string2)	-)	joins two string into one seperate string
		String str6 = "Gowri";
		String str7 = "Shankar";
		String str8 = str6.concat(str7);
		
		
		//string.trim();	-) 	excludes the extra spacings at beg and end of the String
		String str9 = " Gowri Shankar ";
		str9.trim();
		
		
		//string.chatAt()	-)	returns the character at index value
		String strng1 = "Gowri Shankar";
		char cha = strng1.charAt(2);
		
		
		//string.contains(string2)	-) returns a boolean value as true or false
		String strng2 = "Gowri Shankar";
		String strng3 = "Gowri";
		boolean check = strng2.contains(strng3);
		
		
		//string == string2 Vs string.equals(string2) Vs string.equalsIgnoreCase(string2)	-)  returns a boolean value as true of false
												/* '==' compares the reference objects and then compares
												   '.equals()' just compares the value, it will not check references
												   '.equalsIgnoreCase()' as same as .equals but without case sensitive */
		String strng4 = "Gowri Shankar";
		String strng5 = new String("Gowri Shankar");
		String strng6 = "Gowri Shankar";
		String strng7 = "gowri Shankar";
		
		boolean check2 = (strng4 == strng5);	//fail
		boolean check3 = (strng4.equals(strng5));	//pass
		boolean check4 = (strng4 == strng6);	//pass
		boolean check5 = (strng6.equals(strng7));	//fail
		boolean check6 = (strng6.equalsIgnoreCase(strng7));	//pass
		
		
		//string.replace("string1", "string2")	-) 	replaces the char/sequence of characters with desired one's
		String strng8 = "Gowri Shankar Vuyyuri";
		String strng9 = strng8.replace("Vuyyuri", "vuyyuri");
		String strng10 = strng8.replace('i', 'I');
		
		
		//string.substring(beg-i, end-i)	-)		extracts the string within a stirng
		String string = "Gowri Shankar";
		String string1 = string.substring(6, 13);
		String string11 = string.substring(6);
		
		
		//string.toLowerCase() & string.toUpperCase()		-)		converts string into lowercase and Uppercase
		String string2 = "Gowri Shankar";
		String string21 = string2.toLowerCase();
		String string22 = string2.toUpperCase();
		
		
		//string.split(delemeters)		-)		Returns a String[] by splitting the string using delemiters
		String string3 = "Gowri Shankar Vuyyuri";
		String[] string31 = string3.split(" ");
	}

}
