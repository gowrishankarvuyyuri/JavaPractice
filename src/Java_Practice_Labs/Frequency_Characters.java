package Java_Practice_Labs;

import java.util.Arrays;

public class Frequency_Characters {

	public static void main(String[] args) {
		
		String string = "Malayalam";
		string = string.toLowerCase().replace(" ", "");
		char[] charArray = string.toCharArray();
		
		
		//Approach1 using string operations	
		for(int i = 0; i<charArray.length; i++) {
			char ch = charArray[i];
			int count = string.length() - string.replace(String.valueOf(ch), "").length();
			
			if(count == 1) 
				continue;
			
			if(ch != '*' && count > 0) {
				System.out.println(ch + " Repeated " + count); 	
				string = string.replace(String.valueOf(ch), "");
			}
		}
		
		//Approach2
		/*
		for(int x = 0; x < string.length(); x ++) {
			int repet = 0;
			for(int y = x+1; y < string.length(); y++) {
				if(charArray[x] == charArray[y]) {
					repet++;
					charArray[y] = '*';
				}
			}
			if(!(charArray[x]=='*'))
				System.out.println(charArray[x] + " Repeated " + repet);
		}
		*/
		
		//Apprach2 using Array operations
		/*
		String str = "Malayalam";
		str = str.toLowerCase().replace(" ", "");
		
		char[] chr = str.toCharArray();
		char[] chrc = new char[str.length()];
		int index = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int count = 0;
			boolean flag = false;
			
			if(Arrays.binarySearch(chrc, 0, index, chr[i]) < 0) {
				chrc[index] = chr[i];
				index++;
				flag = true;
			}
			
			if(flag) {
				for(int j = i+1; j < str.length(); j++) {
					if(chr[i] == chr[j]) 
						count++;
				}
				System.out.println(chr[i] + " : " + count);
			}
		}
		*/
	}
}
