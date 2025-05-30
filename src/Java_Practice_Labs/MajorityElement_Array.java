package Java_Practice_Labs;

public class MajorityElement_Array {

	public static void main(String[] args) {
		
		int[] array = {2,2,4,4,2};
		
		for(int i=0; i<array.length; i++) {
			int count = 0;
			for(int j = i+1; j<array.length; j++) {
				if(array[i] == array[j])
					count++;
			}
			if(array[i]/2 < count)
				System.out.println(count);
		}

	}

}
