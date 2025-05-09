package ExceptionHandling;

import java.util.Scanner;

//custum exception class
class InsufficientFundsException extends Exception{
	
	InsufficientFundsException(String Message){
		super(Message);
	}
}

//custum exception used in this class
class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdrawl(double balance) throws InsufficientFundsException {
		if(balance > this.balance)
			throw new InsufficientFundsException("Insufficient Funds!! Your Account balance is :" + this.balance);
		this.balance = this.balance - balance;
		
		System.out.println("Withdrawl Successful!! Your Account Balance is: " +balance);
	}
}

public class CustomException {

	public static void main(String[] args) {
		
		BankAccount Bank = new BankAccount(500);
		
		try (Scanner sc = new Scanner(System.in)){
		
			System.out.print("Enter an Ammount for Withdrawl: ");
			double amount = sc.nextDouble();
			Bank.withdrawl(amount);
			sc.close();
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Out of Bank Application !!");
		}
	}
}
