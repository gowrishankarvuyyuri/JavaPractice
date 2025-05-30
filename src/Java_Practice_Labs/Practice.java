package Java_Practice_Labs;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		int[] array = {3,2,1,5,1,2,3};
		int[] newArray = new int[array.length];
		int count = 0;
		
		for(int i =1; i<array.length; i++) {
			boolean exists = false;
			for(int j=0; j<array.length; j++) {
				if(array[i] == array[j]) {
					exists = true;
					break;
				}
			}
			if(!exists) {
				newArray[count++] = array[i];
			}
		}
		array = Arrays.copyOfRange(newArray, 0, count);
        System.out.println(Arrays.toString(array));
		
	}

}
	