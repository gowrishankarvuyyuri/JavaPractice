package Java_Practice_Labs;

import java.util.Arrays;

public class Insertions_Array {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4};
		int[] array2 = {3,4,5,6};
		
		Arrays.sort(array2);
		int[] result = new int[array1.length];
		
		int count = 0;
		for(int i=0; i<array1.length; i++) {
			int postive = Arrays.binarySearch(array2, array1[i]);
			
			if(postive >= 0) {
				result[count] = array1[i];
				count++;
			}
		}
		result = Arrays.copyOfRange(result,0, count);
		System.out.println(Arrays.toString(result));
		
	}	
}
