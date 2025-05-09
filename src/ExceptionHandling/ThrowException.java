package ExceptionHandling;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.print("Enter a Number : ");
		try(Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
			int div = num/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		if(num < 0)
			throw new IllegalArgumentException("Negetive Numbers not allowed");
		else if(num >= 0)
			System.out.println("Number is a Positive Number");
		else
			System.out.println("Strings and Special Characters are not allowed");
		
		System.out.println("Program Completed");
	}

}
