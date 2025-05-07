package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunTimeInputs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("Enter a Number : ");
		int number = scanner.nextInt();
		
		System.out.print("Entered Number is : " + number);
		
		System.out.print("\nEnter a String : ");
		String string = scanner.next();
		
		System.out.print("Entered String is : " + string);
		
		scanner.nextLine();
		
		System.out.print("\nEnter a String : ");
		Object str = scanner.nextLine();
		
		System.out.print("Entered String is : " + str);
		*/
		
		int a[] = new int[6];
		for(int i = 0; i <= a.length-1; i++) {
			System.out.print("Enter a value at " +i+ " position ");
			a[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}
