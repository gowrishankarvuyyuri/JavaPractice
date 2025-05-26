package Java_Strings;

/*String Buffer and Builder are String Object Classes where these are Mutable can modify them*/

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		//declarations
		StringBuffer string = new StringBuffer("Gowri Shankar");
		StringBuilder string2 = new StringBuilder("Gowri Shankar");
		
		
		//String >> StringBuffer/Builder >> String
		String str = "Gowri Shankar";
		
		StringBuffer sbf_str = new StringBuffer(str);
		StringBuilder sbd_str = new StringBuilder(str);
		sbf_str.append(" Vuyyuri");
		
		str = sbf_str.toString();
		System.out.println(str);
		
		
		//StringBuffer/Builder >> String >>StringBuffer/Builder
		StringBuffer sbf_str1 = new StringBuffer("Gowri");
		
		String str1 = sbf_str1.toString();
		String str2 = str1.concat(" Shankar");
		
		sbf_str1 = new StringBuffer(str2);
		System.out.println(sbf_str1);
		
	}

}
