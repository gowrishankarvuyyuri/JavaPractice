package Exception_Handling;

import java.util.Scanner;

public class UnCheckedExceptions {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String Name = ""; 
		int num = 0;
		
		System.out.print("Enter a Name: ");
		Name = scanner.nextLine();
		try {
		num = Integer.parseInt(Name);
		}
		catch (NumberFormatException e) {
			System.out.println(e.toString());
		}
		finally {
			scanner.close();
			System.out.println("Converted String to Int: "+ num);
		}
	}
}
