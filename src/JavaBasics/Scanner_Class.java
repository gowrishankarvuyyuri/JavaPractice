package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//scanner.nextInt()		-)	takes only integer type
		System.out.print("Enter a Number : ");
		int number = scanner.nextInt();
		
		
		//scanner.next()	-)	takes the string value upto one word
		System.out.print("\nEnter a String : ");
		String string = scanner.next();

		
		//scanner.nextLine()	-)	accepts whole string input value
		System.out.print("\nEnter a String : ");
		String str = scanner.nextLine();
		
		
		//object reference		-) when you no idea which value to pass as input
		Object str1 = scanner.nextLine();
		
	}

}
