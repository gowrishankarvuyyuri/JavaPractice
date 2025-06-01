package Exception_Handling;

import java.util.InputMismatchException;

public class unChecked_Exception {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6,7};
		
		/* declaring multiple catch blocks */
		try {
			int value = a[a.length-1];
			int value1 = a[a.length];	//	--)	can't access the elements out of Range
			
			a[0] = 2;
			a[2] = 'a';				//		--)  cant assign a character to int[]
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		
		/* using single catch block will handles all of them */
		try {
			int value = a[a.length-1];
			int value1 = a[a.length];	//	--)	can't access the elements out of Range
			
			a[0] = 2;
			a[2] = 'a';				//		--)  cant assign a character to int[]
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
