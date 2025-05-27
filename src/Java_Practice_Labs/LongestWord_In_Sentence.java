package Java_Practice_Labs;

public class LongestWord_In_Sentence {

	public static void main(String[] args) {
		
		String string = "Gowri Shankar Vuyyuri, and he is from Andhra Pradesh";
		
		String[] str = string.split(" ");
		String longest = "";
		
		for(String st : str) {
			
			if(st.charAt(st.length()-1) == ',') {
				for(char ch : st.toCharArray()) {
					StringBuffer strng = new StringBuffer(st);
					strng.deleteCharAt(st.length()-1);
					st = strng.toString();
				}
			}
			
			if(st.length() > longest.length())
				longest = st;
		}
		System.out.println(longest);
	}

}
