package Java_Practice_Labs;

public class Prime_Number {

	public static void main(String[] args) {
		
		int num = 5;
		
		if(num == 1 || num == 2) {
			System.out.println(num + " is a prime number");
		}
		else {
			boolean isPrime = false;
			for (int i =2 ; i<Math.sqrt(num);  i++) {
				if(num % i == 0) {
					isPrime = true;
					break;
				}	
			}
			
			if(isPrime == true)
				System.out.println(num + " is not a prime number");
			else
				System.out.println(num + " is a prime number");
		}
	}

}
