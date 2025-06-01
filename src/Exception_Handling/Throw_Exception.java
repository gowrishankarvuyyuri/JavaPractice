package Exception_Handling;

import java.util.Scanner;

public class Throw_Exception {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.print("Enter a Number : ");
		
		/* using normal try-catch block statements */
		try {
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			int div = num/0;			//		--)		a number can't divisible by zero
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		
		/* explicitly using throw keyword for managing an exception */
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num == 0)
			throw new IllegalArgumentException("Zero Not allowed as input");
		
		int div = num/2;
		System.out.println("division result : " + div);
		
	}

}
