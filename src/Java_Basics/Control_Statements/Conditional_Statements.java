package Java_Basics.Control_Statements;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If conditional statement
		int number = 20;
		if (number > 0) {
			System.out.println("The number is positive");
		}
		
		//If-Else Conditional Statement
		int age = 18;
		if (age >= 18) 
			System.out.println("Eligible for Voting");
		else 
			System.out.println("Not Eligible for Voting");
		
		
		//Nested If-Else Conditional Statement
		int num = -2;
		if (num >= 0) {
			if (num % 2 == 0)
				System.out.println("Positive and Even Number");
			else
				System.out.println("Postive and Odd Number");
		}
		else {
			if (num % 2 == 0)
				System.out.println("Negetive and Even Number");
			else
				System.out.println("Negetiwv and Odd Number");
		}
		
		
		//If, Else If, Else If, ...., Else
		int x = 10, y = 20, z = 15;
		if (x > y && x > z)
			System.out.println(x);
		else if (y > x && y > z)
			System.out.println(y);
		else
			System.out.println(z);
		
		
		//Using Switch Case for Weekdays with Numbers
		String string = "Thursdy";
		switch (string) {
		
		case "Sunday": System.out.println(1);
						break;
		case "Monday": System.out.println(2);
						break;
		case "Tuesday": System.out.println(3);
						break;
		case "Wednesday": System.out.println(4);
							break;	
		case "Thursday": System.out.println(5);
						break;	
		case "Friday": System.out.println(6);
						break;
		case "Saturday": System.out.println(7);
						break;
		default: System.out.println("Enter the correct Week names");
		}
		
		
	}
}
