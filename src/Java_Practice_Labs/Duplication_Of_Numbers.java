package Java_Practice_Labs;

import java.util.Arrays;

public class Duplication_Of_Numbers {

	public static void main(String[] args) {
		
		int a[] = {2,5,6,7,5,2,6,4,1,3};
		int b[] = new int[a.length];
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		b[0] = a[0];
		int count = 1;
		
		for(int i=1; i<a.length; i++) {
			int index = Arrays.binarySearch(b, 0, count,a[i]);
			
			if(index < 0) {
				b[count] = a[i];
				++count;
			}
			else continue;
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(b, 0, count)));
	}

}
