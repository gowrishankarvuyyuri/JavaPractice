package ExceptionHandling;

import java.util.Scanner;

public class CheckedException {

	/*
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String Name = ""; 
		int num = 0;
		try {
			System.out.print("Enter a Name: ");
			Name = scanner.nextLine();
			Thread.sleep(5000); //InterruptedException
			
			num = Integer.parseInt(Name);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			//System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
			//System.out.println(e.getSuppressed());
			//System.out.println(e.initCause(e));
		}
		finally {
			

		}
		System.out.println("Entered Name is: " + Name);
		System.out.println("Converted String to Int: "+ num);
	}
	*/
	
	static public void main(String []argas) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		String Name = ""; 
		
		System.out.print("Enter a Name: ");
		Name = scanner.nextLine();
		Thread.sleep(5000); //InterruptedException
		
		scanner.close();
		System.out.println("Entered Name is: " + Name);
	}

}
