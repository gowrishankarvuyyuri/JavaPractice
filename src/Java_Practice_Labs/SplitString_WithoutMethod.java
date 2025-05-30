package Java_Practice_Labs;

public class SplitString_WithoutMethod {

	public static void main(String[] args) {
		
		String string = "Gowri Shankar Vuyyuri ";
		char[] charArray = string.toCharArray();
		
		int start = 0, end = 0;
		for(char ch : charArray) {
			if(ch == ' ') {
				System.out.println(string.substring(start,end));
				start = end+1;
			}
			end++;
		}
	}

}
