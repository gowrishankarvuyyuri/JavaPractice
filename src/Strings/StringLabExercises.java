package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

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
		
		
		int a[] = {1, 2, 6, 5, 4, 3};
		/*
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Comparator.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		int b[] = {1, 6, 5, 4, 3};		
		
		boolean isEqual = Arrays.equals(a, b);
		System.out.println(isEqual);
		/*for(int i = 0,j = a.length-1; i<j; i++,j--) {
			if(a[i] < a[j]) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(a, 4)));
		
		
		Arrays.sort(a);
		int index = Arrays.binarySearch(a, 5);
		System.out.println(index);
		*/
		
		Arrays.setAll(a, i -> i * -1);
		System.out.println(Arrays.toString(a));
		
		String string = "Gowri Shankar";
		System.out.println(string.replace("Shankar", "shankar"));
		
 	}

}
