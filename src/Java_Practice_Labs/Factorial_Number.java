package Java_Practice_Labs;

public class Factorial_Number {

	public static void main(String[] args) {
		
		int num = 10;
		int result = num;
		
		for(int i=num; i>1; i--) {
			result = result * (i-1);
		}
		
		System.out.println(result);
	}

}
