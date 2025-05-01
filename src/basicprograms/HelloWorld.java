package basicprograms;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Hello World!," + " I am Gowri Shankar Vuyyuri" + "\t");
		System.out.println("\t" + "Prem is my Nephew");
		// Even or Odd Number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		String result = (number % 2 == 0) ? "Even" : "Odd";
		scanner.close();
		System.out.println("The number is : " + result);
	}
}
