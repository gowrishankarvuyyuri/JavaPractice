package Java_Practice_Labs;

public class Count_Vowels_Consonants {

	public static void main(String[] args) {
		
		String str = "Gowri Shankar@";
		str = str.replace(" ", "");
		char[] ch = str.toCharArray();
		
		int vowel = 0, consonant = 0;
		for(char chr : ch) {
			
			if("aeiou".indexOf(chr) >= 0) {
				vowel+=1;
			}
			else if(Character.isLetter(chr))
				consonant +=1;
		}
		System.out.println("Vowel Count : " +vowel+ "\nConsonants Count : " +consonant);
	}

}
