package Java_Practice_Labs;

public class Fibinacci_Series {

	public static void main(String[] args) {
		
		int first = 0, second = 1;
		
		System.out.print(first + " " + second + " ");
		
		for(int i=2; i<=5; i++) {
			int third = second + first;
			if(third == 5) 
				break;
			
			System.out.print(third + " ");
			//swap
			first = second;
			second = third;
			third = first;
		}
	}

}
