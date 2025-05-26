package Java_Strings;

import java.util.Arrays;

/* String is a Non-Primitive Datatype,
   Variable/Object referenced String Holds the data in form of Character Sequences,
   Single/Multi Dimentional Array String Holds the data in form of Strings,
   We cannot modify the String, bcuz it is immutable doesn't Allow to change,
   String will accept any type of value, but it stores interanlly in string by Typecasting it
*/
public class String_Normal_Dimesntional {

	public static void main(String[] args) {
		
		//Variable Referenced 
		String string = "Gowri Shankar";
		String string2 = "2";
		String string3 = "true";
		String string4 = "A";
		String string5 = "2.008";
		
		System.out.println(string + " " + string2 + " " + string3 + " " + string4 + " " + string5);
		
		//Objected Referenced
		String str = new String("Gowri Shankar");
		String str2 = new String("2");
		String str3 = new String("true");
		String str4 = new String("A");
		String str5 = new String("2.008");
				
		System.out.println(str + " " + str2 + " " + str3 + " " + str4 + " " + str5);
		
		
		//Single Dimentional String
		String[] strng = {"Gowri", "Shankar", "Vuyyuri"};
		String[] strng2 = new String[]{"Gowri", "Shankar", "Vuyyuri"};
		
		System.out.println(Arrays.toString(strng));
		System.out.println(Arrays.toString(strng2));
		
		//Multi Dimentional String
		String[][] stringg = {
								{"Gowri Shankar", "Vuyyuri"},
								{"Rambabu", "Vuyyuri"},
								{"Mani", "Vuyyuri"}
							 };
		System.out.print(Arrays.deepToString(stringg));
		System.out.println();
	}
}
