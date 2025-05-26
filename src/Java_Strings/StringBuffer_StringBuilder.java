package Java_Strings;

/*String Buffer and Builder are String Object Classes where these are Mutable can modify them*/

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		//declarations
		StringBuffer string = new StringBuffer("Gowri Shankar");
		StringBuilder string2 = new StringBuilder("Gowri Shankar");
		
		//String -> StringBuffer/Builder
		String str = "Gowri Shankar";
		StringBuffer sbf_str = new StringBuffer(str);
		StringBuilder sbd_str = new StringBuilder(str);
	}

}
