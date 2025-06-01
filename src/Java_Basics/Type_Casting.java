package Java_Basics;

public class Type_Casting {

	public static void main(String[] args) {
		
		//upcasting primitive datatypes
		int a = 10;
		long intvalue = a;
		
		float f = 10.5f;
		double doublevalue = f;
		
		char c = 'A';
		String str = String.valueOf(c);
		String str2 = Character.toString(c);
		
		int i = 10;
		double ddd = i;

		
		
		//downcasting
		long l = 10;
		int ivalue = (int)l;	
		
		double d = 10.5;
		float fvalue = (float)d;
		
		double dd = 20.56;
		int ii =(int) dd;
		

	}

}
