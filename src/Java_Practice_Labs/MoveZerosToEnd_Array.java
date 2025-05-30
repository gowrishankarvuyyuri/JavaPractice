package Java_Practice_Labs;

import java.util.Arrays;

public class MoveZerosToEnd_Array {

	public static void main(String[] args) {
		
		int index = 0;
		int[] array = {0,1,0,0,3,2};
		for(int val : array) {
			if(val != 0) 
				array[index++] = val;
		}
		
		Arrays.fill(array, index, array.length, 0);
		
		System.out.println(Arrays.toString(array));

	}

}
