package basicprograms;

public class TypeCasting_PreDefined {

	public static void main(String[] args) {
		
		/*
		//Rule 1 itself failed
		String str = new String("Welcome");
		StringBuffer strb = (StringBuffer) str;
		*/
		
		/*
		//Rule3 failes
		Object obj = new String("Welcome");
		StringBuffer strb = (StringBuffer) obj;
		*/
		
		/*
		//rule2 failes
		Object obj = new String("Welcome");
		StringBuffer strb = (String) obj;
		*/
		
		
		//every rule satisfies here
		Object obj = new String("Welcome");
		String strb = (String) obj;
		System.out.println(strb);
	}

}
