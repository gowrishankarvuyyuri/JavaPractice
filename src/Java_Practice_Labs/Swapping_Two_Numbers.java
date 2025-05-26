package Java_Practice_Labs;

public class Swapping_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using variable
		int a = 2, b = 5,c;
		c = b;
		b = a; 
		a = c;
		System.out.println("After Swapping a is " +a+ ", b is " +b);
		
		//withoout using variable
		int x = 2, y = 5;
		y -= x;
		x += y;
		--y;
		System.out.println("After Swapping x is " +x+ ", y is " +y);
	}

}
