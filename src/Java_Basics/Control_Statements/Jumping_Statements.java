package Java_Basics.Control_Statements;

public class Jumping_Statements {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,6,7,8,8};
		
		//break statement
		for(int i = 0; i < a.length; i++) {
			if(i == 5)
				break;
			System.out.println(a[i]);
		}
		System.out.println();
		
		//continue statement
		for(int i = 0; i < a.length; i++) {
			if(i == 5)
				continue;
			System.out.println(a[i]);
		}
	}

}
