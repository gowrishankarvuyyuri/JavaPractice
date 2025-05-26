package Java_Arrays;

public class Single_Dimenstional {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
				//declare would be done either of these ways
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
