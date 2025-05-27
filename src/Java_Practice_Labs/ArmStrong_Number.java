package Java_Practice_Labs;

public class ArmStrong_Number {

	public static void main(String[] args) {
		
		int num = 153;
		int num1 = num;
		int get;
		int count = 0;
		
		while(num != 0) {
			get = num%10;
			count = count + (get*get*get);
			num = num/10;
		}
		
		System.out.println((num1 == count)? "ArmStrong Number" : "Not_An_Armstrong Number");
	}

}
