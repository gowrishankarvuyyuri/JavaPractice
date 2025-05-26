package Java_Arrays;

public class Multi_Dimentional {

	public static void main(String[] args) {
		
		//Static Approach
		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		//Dynamic Approach
		int b[][] = { {100, 200},
					  {300, 400},
					  {500, 600}
					};
		
		
		//finding the size of an Array
		System.out.println("Size of an Row is " + b.length);
		System.out.println("Size of an coloumn at '0' row position " + b[0].length);
		
		
		//calling single value
		System.out.println("Calling 2nd row 1st coloumn is " + b[2][1]);
		
		
		//printing multiple values using normal for loop
		for (int row = 0; row <= b.length-1; row++) {
			for (int col = 0; col <= b[row].length-1; col++) {
				System.out.print(a[row][col] + " ");
			}
		}
		System.out.println();
		
		
		//using for each loop for printing values
		for (int arr[] : b) {
			for (int c : arr) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
		
		
		//Object Array can store multiple datatype values
		Object x[] = {1, 1.2, 'A', true, "Gowri Shankar"};
		
		//printing normal for loop
		for(int i = 0; i <= x.length-1; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		//for each loop
		for(Object y:x) {
			System.out.print(y + " ");
		}
	}	
	
}
