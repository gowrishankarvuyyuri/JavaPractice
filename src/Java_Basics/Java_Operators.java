package Java_Basics;

public class Java_Operators { 
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		//Arithemetic Numbers
		System.out.println("The Sumation of numbers " +(a+b));
		System.out.println("The Subtraction of Numbers " +(a-b));
		System.out.println("The Multipilcations of Numbers " +(a*b));
		System.out.println("The Division of Numbers " +(a%b));
		System.out.println("The Cofficient of Numbers " +(a/b));
		
		//Relational Operators
		System.out.println(a > b); //false
		System.out.println(a < b); //true
		System.out.println(a >= b); //false
		System.out.println(a <= b); //true
		System.out.println(a != b); //true
		System.out.println(a == b); //false
		
		/*Incremental/Decremental Operators*/
		System.out.println(a++ + " " + b--); 	//10 20
		System.out.println(a + " " + b);	//11 19
		
		System.out.println(++a + " " + --b);	//12 18
		System.out.println(a + " " + b);	//12 18
		
		//Assignment Operator
		System.out.println("The value of a and b are " +a+ " , " +b); // 11, 19
		b = a;
		System.out.println("The value of a and b are " +a+ " , " +b); // 11, 11
		System.out.println("The Sumation of value a with b is " +(a+=b));// 22
		System.out.println("The Subtraction of value a with b are " +(a-=b)); //11
		System.out.println("The Mutliplication of value a with b are " +(a*=b)); //121
		
		//Ternary Operator
		int number = 20;
		String result = (number%2 == 0)? "Eligible" : "Not Eligible";
		boolean bln = (number%2 == 0)? true : false;
		System.out.print("The person with age 20 is " +result+ " for vote\n"); //Eligible
		System.out.println("Is person age 20 eligible for vote? " + bln);
		
		//Logical Operators
		System.out.println("The Values of a and b are " + a +", "+ b);
		boolean b1 = a > b; // true
		boolean b2 = a < b; // false
		System.out.println("Boolean values of b1 nd b2 are " +  b1 +", "+ b2); 
		System.out.println("Logical And Operator " +  (b1 && b2)); // false
		System.out.println("Logical OR Operator " +  (b1 || b2)); // true
		System.out.println("Logical Not Equals Operator " +  (!b1)); // false
		
		//Pre & Post Increment/Decrements
		int x = 10;
		int res = x++; //post increment
		System.out.println(res); //10
		System.out.println(x); //11
		
		res = ++x;
		System.out.println(res); //12
		System.out.println(x); //12
		
		res = x--; //post increment
		System.out.println(res); //12
		System.out.println(x); //11
		
		res = --x;
		System.out.println(res); //10
		System.out.println(x); //10
		
	}
}
