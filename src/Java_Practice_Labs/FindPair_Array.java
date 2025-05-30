package Java_Practice_Labs;

import java.util.Arrays;

public class FindPair_Array {

	public static void main(String[] args) {
		
		int[] intArray = {1,3,2,4,5};
		int sum = 6;
		Arrays.sort(intArray);
		
		for(int i=0; i<intArray.length-1; i++) {
			for(int j=i+1; j<intArray.length; j++) {
				if ((intArray[i]+intArray[j]) == sum)
					System.out.println("(" + intArray[i] + "," + intArray[j] + ")");	
			}
		}
	}

}
