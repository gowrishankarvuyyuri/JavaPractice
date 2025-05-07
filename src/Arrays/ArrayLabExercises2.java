package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLabExercises2 {

	public static void main(String[] args) {
	
		//int array[] = {10, 20, 10, 20, 10, 10, 69, 23};
		
		//System.out.println(Arrays.toString(array));
		
		/*searching an element in an Array Linear Search)
		boolean prt = false;
		int num = 21;
		for(int arr : array) {
			if (arr == num) {
				prt = true; break;
			}
			else
				prt = false;
		}
		
		if(prt) System.out.println("Element is present in Array");
		else	System.out.println("Element is not present in Array");
		*/
		
		
		/*duplication of numbers
		int[] array = {1, 2, 3, 2, 4, 5, 6, 3, 7};
        System.out.print("Duplicate elements: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
        */

		
		
		
		//Sorting an int Array
		/*for(int i = 0; i <= array.length-1; i++) {
			for (int j = i+1; j <= array.length-1; j++) {
				if (array[i] < array[j]) {
					
				}
			}
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
		
		/*sorting an String and Character Array
		char ch[] = {'G', 'O', 'W', 'R', 'I'};
		String str[] = {"Vuyyuri", "Shankar", "Gowri"};
		
		Arrays.sort(ch); 
		System.out.println("Sorting char Array " + Arrays.toString(ch));
		
		Arrays.sort(str);
		System.out.println("Sorting String Array " + Arrays.toString(str));
		*/
		
		
		/*Reversing an int Array 
		Arrays.sort(array);
		for (int i = 0, j = array.length-1; i < j ; i++, j--) {
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp; 
		}
		System.out.print(Arrays.toString(array));
		*/
		
		/*Reverse a String Array
		String str[] = {"Vuyyuri", "Gowri", "Shankar", "Boy"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		for (int i = 0, j = str.length-1; i < j ; i++, j-- ) {
			String temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
		System.out.print(Arrays.toString(str));
		*/
		
		/*Sorting an int Array using for loop
		int array[] = {10, 20, 10, 20, 10, 10, 69, 23};
		for (int i = 0; i <= array.length-1; i++) {
			for(int j = i+1; j <= array.length-1; j++) {
				if (array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		*/
		

		
	}

}
