package Java_Strings;

public class Buffer_Builder_Operations {

	public static void main(String[] args) {
		
		//sb.toString()		-)		converts from stringbuffer to String
		StringBuffer string = new StringBuffer("Gowri Shankar");
		String str = string.toString();
		
		
		//sb.append(string)	-)	appends the string to string buffer
		StringBuffer string2 = new StringBuffer("Gowri");
		System.out.println(string2.append(" Shankar"));
		
		
		//sb.reverse()	-)	reverse the string
		StringBuffer string3 = new StringBuffer("Gowri");
		System.out.println(string3.reverse());
		
		
		//sb.insert(index, string)	-)	insert the string at index value
		StringBuffer string4 = new StringBuffer("Gowri Vuyyuri");
		System.out.println(string4.insert(6, "Shankar "));
		
		
		//sb.replace(beg_i, end_i, string)	-)	replaces the desired string by considering index range 
		StringBuffer string5 = new StringBuffer("Gowri Vuyyuri");
		System.out.println(string5.replace(6, 13, "Shankar"));
		
		
		//sb.delete(beg_i, end_i)	
		StringBuffer string6 = new StringBuffer("Gowri Vuyyuri");
		System.out.println(string6.delete(6, 13));
		
		
		//sb.deleteChatAt(index)
		StringBuffer string7 = new StringBuffer("Gowri Vuyyuri");
		System.out.println(string7.deleteCharAt(0));
		
	}

}
