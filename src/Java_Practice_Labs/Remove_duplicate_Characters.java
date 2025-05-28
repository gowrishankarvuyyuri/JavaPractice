package Java_Practice_Labs;

import java.util.Arrays;

public class Remove_duplicate_Characters {

	public static void main(String[] args) {
		
		//Approach 1
		String str = "Malayalam";
		char[] charArray = str.toCharArray();
		char[] newcharArray = new char[str.length()-1];
		
		newcharArray[0] = charArray[0];
		
		
		int count = 1;
		for(int i=1; i<str.length()-1; i++) {
			
			if(Arrays.binarySearch(newcharArray, 0, count, charArray[i]) < 0) {
				newcharArray[count] = charArray[i];
				count+=1;
			}
		}
		System.out.println(String.valueOf(Arrays.copyOfRange(newcharArray, 0, count)));
		
	}

}
