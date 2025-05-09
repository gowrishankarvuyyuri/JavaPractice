package basicprograms;

public class WrapperClasses {
	
	String Id = "21";
	String fl = "True";
	
	int i = 10;
	float f = 10.0f;
	long l = 10L;
	boolean b = true;
	char c = 'g';
	
	Integer in = new Integer(100);
	Integer inn = Integer.valueOf(121);
	int innn = inn.intValue();
	
	
	
	public static void main(String[] args) {
		
		WrapperClasses wc = new WrapperClasses();
		
		//String to primitive datatypes
		System.out.println(Integer.parseInt(wc.Id));
		System.out.println(Double.parseDouble(wc.Id));
		System.out.println(Long.parseLong(wc.Id));
		System.out.println(Float.valueOf(wc.Id));
		System.out.println(Boolean.parseBoolean(wc.fl));
		//System.out.println(Character.parseCharacter(wc.Id)); //doesn't support string is a collection of char's
		System.out.println();
		
		//primitive to String Conversion
		System.out.println(String.valueOf(wc.i));
		System.out.println(Integer.toString(wc.i));
		System.out.println(String.valueOf(wc.f));
		System.out.println(String.valueOf(wc.l));
		System.out.println(String.valueOf(wc.b));
		System.out.println(String.valueOf(wc.c));
		
		//object primitive to String
		System.out.println(Integer.toString(wc.in));
		System.out.println(Integer.toString(wc.inn));
		
		System.out.println(Integer.compare(10, 11));
		System.out.println(Integer.max(10, 20));
		
		System.out.println(wc.innn);
		System.out.println(Character.isDigit(wc.c));
		System.out.println(Character.isLetter(wc.c));
	//.out.println(Character.is);
		
		
		String string = "Gowri @ Shankar";
		String result = String.join(" ", "Gowri Shankar","Vuyyurui");
		System.out.println(result);
		int flag = 0;
		for(char c : string.toCharArray()) {
			if(Character.isDigit(c)) {
				flag=1;
				break;
			}
		}
		System.out.println("Contains Digit ? " + (flag==1?"Yes":"No"));
	}

}
