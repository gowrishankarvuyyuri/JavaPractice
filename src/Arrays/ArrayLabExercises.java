package Arrays;

import java.util.Arrays;

public class ArrayLabExercises {

	public static void main(String[] args) {
		
		//Summation of elements in an Array
		/*int elements[] = {1, 2, 3, 4, 5};
		int sum = 0; 
		
		for (int ele : elements) {
			sum = sum + ele;
		}
		System.out.print("Sum of Elements in an Array is " + sum);
		*/
		
		
		//Even or Odd Number from an Array
		/*int elements[] = {1, 2, 3, 4, 5};
		int even = 0;
		int odd = 0;
		for (int ele : elements) {
			if (ele % 2 == 0) even++;
			else odd++;
		}
		System.out.print("Even Numbers Count is " + even + "\nOdd Number count is " + odd);
		*/
		
		
		//Finding Prime Numbers
		int elements[] = {1, 2, 3, 4, 5, 6, 7};
		int prime[] = new int[elements.length];
		int raise = 0;
		for (int ele: elements) {
			if (ele < 2) continue;
			
			boolean isPrime = true;
			for (int i = 2; i <= ele/2; i++) {
				if (ele % i == 0)
					isPrime = false;
					break;
			}
			
			if(isPrime)
				prime[raise++] = ele;
		}
//		System.out.println(prime); // prints memory reference
//		System.out.println(Arrays.toString(prime)); // prints with unused locations as well
//		System.out.println(Arrays.toString(Arrays.copyOf(prime, prime.length))); // creates new array contains upto raise<int> elements
		System.out.println(Arrays.toString(Arrays.copyOf(prime, prime.length)));
//		for (int p : prime) {
//			System.out.print(p + " ");
//		}
	}

}
