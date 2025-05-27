package Java_Practice_Labs;

import java.util.Arrays;
import java.util.Collections;

public class Largest_SencondLargest_Number {

	public static void main(String[] args) {
		
		int a[] = {1,4,6,4,7,4,3,2};
		
		Arrays.sort(a);
		
		
		System.out.println("Largest : " +a[a.length-1]);
		System.out.println("Second Largest : " +a[a.length-2]);
	}

}
