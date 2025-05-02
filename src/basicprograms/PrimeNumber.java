package basicprograms;


public class PrimeNumber {
	public static void main(String[] args) {
		
		int input = 5;
		// square pattern
		for (int row = 0; row < input; row++) {
			for (int col = 0; col < input; col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Left Right Angled Triangle
		for (int row = 0; row < input; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Mirrored Right Angled Triangle
		
		for (int row = 0; row <= input; row++) {
			for (int col = row+1; col <= input; col++) {
				System.out.print(" * ");	
			}
			System.out.println();
		}
		
		//Missing Middled Ordered
		for (int row = 0; row < input; row ++) {
			for (int col = 0; col < input; col++) {
				if (row == col)
					System.out.print("   ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//Mirrored the above one
		for (int row = 1; row <= input; row++) {
			for (int col = 1; col <= input; col++) {
				if (col == input - row + 1)
					System.out.print("   ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int row = 1; row <= input; row++) {
			for (int col = 1; col <= input; col++) {
				if (row == col || col == (input - row + 1))
					System.out.print(" + ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// Timer Clock
		for (int row = 1; row <= input; row ++) {
			for (int col = 1; col <= input; col ++) {
				if (col == 1 || row == col || col == (input - row + 1) || col == input) 
					System.out.print(" + ");
				else 
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//Revered Timer Clock
		for (int row = 1; row <= input; row++) {
			for (int col = 1; col <= input; col++) {
				if (row == col || col == input + 1 - row || row == 1 || row == input)
					System.out.print(" + ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}