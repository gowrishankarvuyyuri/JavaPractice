package Java_Practice_Labs;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		
		int a = 123;
		int rev = 0;
		int last_digit;
		while(true) {
			last_digit = a % 10;
			rev = rev + last_digit;
			a = a /10 ;
			if(a == 0)
				break;
		}
		System.out.println(rev);
	}

}
