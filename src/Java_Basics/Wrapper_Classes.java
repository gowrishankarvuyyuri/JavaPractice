package Java_Basics;

import java.util.Arrays;

public class Wrapper_Classes {
	
	int num = 10;
	String f = "2.3";
	String str_num = "20";
	int numArray[] = {2,4,5,6};
	
	public static void main(String[] args) {
		Wrapper_Classes wc = new Wrapper_Classes();
		
		/*converts from String to primitive dataTypes or Wrapper class Objects*/
		int it = Integer.parseInt("20");
		float f = Float.parseFloat("20.35");
		boolean b = Boolean.parseBoolean("true");
		double d = Double.parseDouble("30.24567");
		
		
		/*converts primitive dataTypes or Wrapper classes to String*/
		String chString = String.valueOf('A');
		String intString = String.valueOf(1);
		String floatString = String.valueOf(2.3);
		String booleanString = String.valueOf(true);
		char[] charArray = {'G','o','w','r','i'};
		String chArrayString = String.valueOf(charArray);
		
		
		/*converts int[] to Integer[]*/
		Integer n1 = Integer.valueOf(wc.num);			//	--)		converts int to Integer
		Integer[] n2 = new Integer[wc.numArray.length];
		for(int i = 0; i < wc.numArray.length; i++) {
			n2[i] = Integer.valueOf(wc.numArray[i]);
		}
		
	
		/*wrapper classes functionalities*/
		int comparedValue = Integer.compare(1, 2);		//	--)		If both are equal results '0' else '-1'
		int maxValue = Integer.max(1, 2);				//	--)		results max number
		int minValue = Integer.min(1, 2);				//	--)		results min value
		
		
		/*Character Wrapper Class Methods will always returns 'true' or 'false'*/
		boolean statusDigit = Character.isDigit(1);		
		boolean statusLetter = Character.isLetter('A');	
		boolean statusDigitorLetter = Character.isLetterOrDigit('A');
		boolean statusWhiteSpace = Character.isWhitespace(' ');
		boolean statusSpecialChar = !(Character.isLetterOrDigit('@'));	//	--)		special character
		
		char statusLowerCase = Character.toLowerCase('A');				//	--)		returns a character by changing to Lowercase
		char statusUpperCase = Character.toUpperCase('a');				//	--)		returns a character by changing to Uppercase
		
	}

}
