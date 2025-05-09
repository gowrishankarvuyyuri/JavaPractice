package basicprograms;

public class TypeCasting {

	public static void main(String[] args) {
		
		//upcasting primitive datatypes
		int a = 10;
		long intvalue = a;
		System.out.println(intvalue);
	
		
		float f = 10.5f;
		double doublevalue = f;
		System.out.println(doublevalue);
		
		char c = 'A';
		String str = String.valueOf(c);
		String str2 = Character.toString(c);
		System.out.println(str+str2);
		
		int i = 10;
		double ddd = i;
		System.out.println(ddd);
		
		System.out.println();
		
		//downcasting
		long l = 10;
		int ivalue = (int)l;
		System.out.println(ivalue);
	
		
		double d = 10.5;
		float fvalue = (float)d;
		System.out.println(fvalue);
		
		double dd = 20.56;
		int ii =(int) dd;
		System.out.println(ii);
		System.out.println();
		
		/*
		String string = "Gowri Shankar"; //GoWrI sHaNkAr
		int count = 1;
		int size = string.length();
		
		for(char cc : string.toCharArray()) {
			if (cc == ' ') {
				System.out.print(" ");
			}
			else {
				if(count % 2 == 0 && count <= size) System.out.print(Character.toLowerCase(cc));
				else System.out.print(Character.toUpperCase(cc));
				count++;
			}
		}
		*/
		System.out.println();
		
		String string = "Gowri Shankar"; //GoWrI sHaNkAr
		StringBuffer result = new StringBuffer();
		int count = 1;
		int size = string.length();
		
		for(char cc : string.toCharArray()) {
			if (cc == ' ') {
				result.append(' ');
			}
			else {
				if(count % 2 == 0 && count <= size) result.append(Character.toUpperCase(cc));
				else result.append(Character.toLowerCase(cc));
				count++;
			}
		}
		System.out.println(result);
	}

}
