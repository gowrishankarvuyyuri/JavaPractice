package Java_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
  
*/

public class Operations_On_Arrays {

	public static void main(String[] args) {
		
		int a[] = {9,7,5,3,1,2,4,6,8};
		
		/*Arrays.asList(array) -) Converts Array to List,
		 					 Fixed Size Cant Modify */
		Integer[] array = {1,2,3,4};
		List<Integer> list = Arrays.asList(array);
		
		
		//Collection.reverse(array)	-)	reverse an array
		Collections.reverse(list);	
		
		
		//Arrays.sort(array, comparator)	-) sorts and reverse at one shot
		Integer a3[] = {3,2,5,3,5,3,2};
		Arrays.sort(a3, Collections.reverseOrder());

		
		//Arrays.sort(array)	-)	 sorts in ascending order
		Arrays.sort(a);	
		
		
		//Arrays.toString(array)		-)	prints the 1D elements in list format
		System.out.println(Arrays.toString(a));
		
		
		//Arrays.deepToString()	-)	prints the 2D array in a list format
		int [][] aa = {{1,2}, {3,4}};
		System.out.println(Arrays.deepToString(aa));
		
		
		//Arrays.mismatch(array1, array2)	-) compares are returns the index value 
		int a1[] = {1,2,3,4};
		int	a2[] = {1,2,4,3};
		System.out.println(Arrays.mismatch(a1, a2));
		
		
		//Arrays.copyOf(array, index)	-)	Copies the array to another array upto index specified
		int[] a4 = Arrays.copyOf(a, 6);
		System.out.println(Arrays.toString(a4));
		
		
		//Arrays.copyOfRange(array, beg_index, end_index)	-)	Unlike copyOf it copies the elemens based on range
		int a5[] = Arrays.copyOfRange(a, 2, 4);
		System.out.println(Arrays.toString(a5));
		
		
		//Arrays.equals(a1, a2)		-) 		return boolean value if both arrays are equal for Single Dimentional array
		int[] b1 = {1,2,3};
		int[] b2 = {1,2,4};
		boolean equals = Arrays.equals(b1, b2);
		System.out.println(equals);
		
		
		//Arrays.deepEquals(a1, a2)		-) 		return boolean value if both arrays are equal for Two Dimentional array
		int[][] b3 = {{1,2},{3,4}};
		int[][] b4 = {{1,2},{3,5}};;
		boolean equalstwo = Arrays.deepEquals(b3, b4);
		System.out.println(equalstwo);
		
		
		/*Arrays.binarySearch(array, key)	-)	returns index value the key/value present in array, 
		  										but first the array must be sorted,
		  										returns -ve value if key not found!	 */
		int[] b = {2,5,6,7,5,2,6,4,1,3};
		Arrays.sort(b);
		int index = Arrays.binarySearch(b, 2);
		//int index = Arrays.binarySearch(array, beg_index, spec_index, key)
		System.out.println(index);
		
	}

}
