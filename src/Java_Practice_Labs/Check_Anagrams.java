package Java_Practice_Labs;

import java.util.Arrays;

public class Check_Anagrams {

	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		
		char[] Array1 = str1.toCharArray();
		char[] Array2 = str2.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		System.out.println(Arrays.equals(Array1, Array2) ? "Anagrams" : "Non-Anagrams");
	}

}
