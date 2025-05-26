package Java_Practice_Labs;

import java.util.Arrays;

public class Reverse_1D {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i =0, j = a.length-1; i < j; i++, j--) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
