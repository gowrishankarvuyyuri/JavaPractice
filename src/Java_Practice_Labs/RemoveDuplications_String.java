package Java_Practice_Labs;

public class RemoveDuplications_String {

	public static void main(String[] args) {
		
		String str = "automation";
		char[] ch = str.toLowerCase().toCharArray();
		
		for(int i = 0; i<ch.length-1 ; i++) {
			char val = ch[i];
			for(int j = i+1; j < ch.length-1; j++) {
				if(ch[i] == ch[j])
					ch[j] = ' '	;
			}
		}
		str = String.valueOf(ch);
		str = str.replace(" ", "");
		System.out.println(str);
	}

}
