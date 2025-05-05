package ConditionalStatements;

public class IterativeStatments {

	public static void main(String[] args) {
		
//		while loop
//		int num = 0;  //init
//		while(num > 0) {  //cond
//			System.out.println(num + "Hello Gowri");
//			num--;     // dec
//		}
//		while (true) {
//			System.out.println("Gowri Shankar");
//			num++;
//			
//			if(num == 10) break;
//		}
		
		
		//even numbers between 1.. 10
//		int numb = 0;
//		while(numb <= 10) {
//			System.out.println(numb);
//			numb+=2;
//		}
//		while(numb <= 10) {
//			if (numb % 2 == 0) System.out.print(numb + " is even\n");
//			else System.out.println(numb + " is odd");
//			numb++;
//		}
		
		
		
		//do while loop
//		int num = 11;
//		do {
//			System.out.print(num + " ");
//			num++;
//		}while(num <= 10);
		
		
		//for loop
//		int num;
//		for (num = 0; num <= 10; num+=2) {
//			System.out.println(num + " is Even");
//		}
//		
//		for (num = 10; num > 0; num--) {
//			if (num % 2 == 0) System.out.println(num + " is Even");
//			else System.out.println(num + " is Odd");
//		}
		
		
//		for (int i = 0; i <= 10; i++) {
//			if (i == 2) continue; 	
//			else if (i == 7) break;
//			System.out.print(i + " ");
//		}
		
		//reverse a number using % / = operator
//		int num = 121, rev_num = 0;
//		int n = num;
//		while (num != 0) {
//			rev_num = rev_num * 10 + num % 10 ;
//			num = num/10;
//		}
//		if (n == rev_num)
//			System.out.println("Actual Number " + n + " is Palindrome");
		
		
		//count number of digits in a number
//		long num = 9000433573L, rev;
//		int even = 0, odd = 0;
//		while( num!=0 ) {
//			rev = num % 10;
//			num = num / 10;
//			if (rev % 2 == 0) even++;
//			else odd++;
//		}
//		System.out.println("No of Even " +even+ " and Odd " +odd);
		
		
		//sum of digits in a number
		int num = 1234567, sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("summation of number is " + sum);
	}

}
