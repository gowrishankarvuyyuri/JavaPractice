package Java_Basics.Control_Statements;

public class Iterative_Statements {

	public static void main(String[] args) {
		
		//while loop
		int num = 1; 
		while(num > 0) {  
			System.out.println(num + "Hello Gowri");
			num--; 
		}
		
		while (true) {
			System.out.println("Gowri Shankar");
			num++;
			if(num == 10) 
				break;
		}
			
		//do while loop
		int num1 = 11;
		do {
			System.out.print(num1 + " ");
			num--;
		}while(num >= 5);
		
		
		//for loop
		int num2;
		for (num2 = 0; num2 <= 10; num2+=2) {
			System.out.println(num + " is Even");
		}
		
		for (num2 = 10; num2 > 0; num2--) {
			if (num2 % 2 == 0) System.out.println(num + " is Even");
			else System.out.println(num2 + " is Odd");
		}
		
		//enhanced for-loop
		int [] aa = {1,2,3,4,5,6,7};
		for(int a : aa) {
			System.out.println(a);
		}
		String[] ss = {"Gowri", "Shankar", "Vuyyuri"};
		for(String s : ss) {
			System.out.println(s);
		}
	}

}
