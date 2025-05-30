package Java_Practice_Labs;

public class MissingNumber_Array {

	public static void main(String[] args) {
		
		int[] array = {2,4,8,10};
		int diff = array[1] - array[0];
		
		for(int i = 1; i < array.length-1 ; i++) {
			if(!(diff == array[i+1]-array[i])) {
				System.out.println(array[i+1] - array[0]);
			}
		}
	}

}
