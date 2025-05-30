package Java_Practice_Labs;

import java.util.Arrays;

public class RotateBy_Kelements {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int k = 2;
		
		for(int rep = 1; rep <= k; rep ++) {
			int val = array[0];
			
			for(int i = 0; i < array.length-1; i++) {
				array[i] = array[i+1];
			}
			
			array[array.length-1] = val;
		}
		System.out.println(Arrays.toString(array));
	}

}
