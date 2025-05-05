package DataTypesandVariables;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using variable
		int a = 2, b = 5,c;
		System.out.println("With Variable before Swapping a, b are " +a+ ", " +b);
		c = b; b = a; a = c;
		System.out.println("With Variable After Swapping a, b are " +a+ ", " +b);
		
		//withoout using variable
		int x = 2, y = 5;
		System.out.println("\nWithout Variable before Swapping x,y are " +x+ ", " +y);
		y-=x; x+=y;
		System.out.println("Without Variable After Swapping x,y are " +x+ ", " +y);
		
		//Multiplication
		int m = 2, n = 5;
		System.out.println("\nMultiplicity before Swapping m,n are " +m+ ", " +n);
		m = n/m * 10;
		n = m/n * 10;
		System.out.println("Multiplicity before Swapping m,n are " +m+ ", " +n);
	}

}
