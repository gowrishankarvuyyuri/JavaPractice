package Arrays;

public class SingleDimenstional {

	public static void main(String[] args) {
		
		//Approach 1
			//declaration of an Array
		int a[] = new int[5];
			//adding values to an Array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		//Approach 2
		//declaration and assinging at one liner
		int b[] = {100, 200, 300, 400, 500};
		
		//finding length of an Array
		System.out.println(a.length + ", " + b.length);
		
		//reading values in an Array
		for (int i = 0; i <= b.length-1; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		//enhanced or for-each loop
		for(int val : a) {
			System.out.print(val+" ");
		}
	}

}
