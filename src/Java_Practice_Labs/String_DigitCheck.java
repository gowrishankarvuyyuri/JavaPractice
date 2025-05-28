package Java_Practice_Labs;

public class String_DigitCheck {

	public static void main(String[] args) {
		
		String string = "1234";
		int flag = 0;
		
		for(char ch : string.toCharArray()) {
			if(!Character.isDigit(ch)) {
				System.out.println("not a number");
				flag = 1;
				break;
			}	
		}
		
		if(flag == 0)
			System.out.println("Its a number");
	}

}
