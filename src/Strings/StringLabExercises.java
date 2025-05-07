package Strings;

import java.util.Arrays;

public class StringLabExercises {

	public static void main(String[] args) {
	
		//reversing a string
		
		/*String reverse = "";
		for(int i = name.length()-1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		
		
		char[] ch = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev+ch[i];
		}
		System.out.println(rev);
		*/
		
		/*StringBuffer name = new StringBuffer("Gowri Shankar");
		System.out.println(name.reverse());
		
		
		StringBuilder names = new StringBuilder("Gowri Shankar");
		System.out.println(names.reverse());
		*/
		
		/*removing white spaces in string
		String string = "  Gowri Shankar Vuyyuri   ";
		String name1 = string.trim().replace(" ", "");
		System.out.println(name1);
		*/
		
		/*Count Occurences of a character
		char str[] = name.toCharArray();
		for(int i = 0; i < str.length; i++) {
			int count = 0;
			for(int j = i+1; j < str.length; j++) {
				if(str[i] == str[j]) count++;
				break;
			}
			System.out.println("The alphabet " +str[i]+ " repeated " +count+ " times");
		}
		*/
		
		//StringBuffer string = new StringBuffer(name);
		/*StringBuffer string2 = new StringBuffer("Gowri Shankar");
		System.out.println(string.compareTo(string2));
		string.append(" Vuyyuri");
		System.out.println(string +"\n" +name+ "\n" + string.reverse());
		System.out.println(string.insert(6, "Gowri"));
		System.out.println(string.replace(0, 11, "Gowri "));
		System.out.println(string.delete(5, 14));
		
		String name = new String("Gowri Shankar");
		String names = new String("Gowri Shankar");
		
		System.out.println(name == names);
		System.out.println(name.equals(names));
		*/
 	}

}
