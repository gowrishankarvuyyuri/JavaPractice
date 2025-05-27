package Java_Practice_Labs;

import java.util.Arrays;

public class Frequency_Alphabets {

	public static void main(String[] args) {
		
		String string = "Gowri Shankar";
		string = string.replace(" ", "");
		
		
		//Approach1 using string operations
		for(char ch : string.toCharArray()) {
			
			if(string.indexOf(ch) == string.lastIndexOf(ch))
				System.out.println("Character " + ch + " : 1");
			else {
				int count = string.length() - string.replace(String.valueOf(ch), "").length();
				System.out.println("Character " + ch + " : " + count);
			}
			
			string = string.replace(String.valueOf(ch), "");
		}
		
		//Apprach2 using Array operations
		
		String str = "MalayalaM";
		str = str.replace(" ", "");
		
		char[] chr = str.toCharArray();
		char[] chrc = new char[str.length()];
		int num = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			int count = 0;
			boolean flag = false;
			
			if(Arrays.binarySearch(chrc, 0, num, chr[i]) < 0) {
				chrc[num] = chr[i];
				num++;
				flag = true;
			}
			
			if(flag) {
				for(int j = i+1; j < str.length(); j++) {
					if(chr[i] == chr[j]) {
							count++;
					}
				}
				System.out.println(chr[i] + " : " + count);
			}
		}
	}
}
