package Java_Arrays;

public class Object_Array {

	public static void main(String[] args) {
		
		Object x[] = {1, 1.2, 'A', true, "Gowri Shankar"};
		
		
		//printing normal for loop
		for(int i = 0; i <= x.length-1; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		
		//for each loop
		for(Object y:x) {
			System.out.print(y + " ");
		}

	}

}
