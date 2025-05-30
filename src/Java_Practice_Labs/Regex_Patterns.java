package Java_Practice_Labs;

import java.util.regex.Pattern;

public class Regex_Patterns {

	public static void main(String[] args) {
		/*Email Regex*/
		String emailPattern = "^[A-za-z0-9+_.]+@gmail.com+$";
		String email = "shankar@gmail.com";
		boolean status = Pattern.matches(emailPattern, email);
		boolean status1 = email.matches(emailPattern);
		
		//phoneNumber 	-)	^[789]\d{9}$
		//passWord		-)	^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$
		//email 		-)	^[A-za-z0-9+_.]+@gmail.com+$
		//dateFormat	-)	^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\d{4}$
		//alphaNumeric	-)	^[a-zA-Z0-9]+$
		
		
		
		/*
		  +		1 or more of previous token			a+ → a, aaa	
		  * 	0 or more of previous token			a* → "", aaa
		  .		Any single character				a.b → acb
		  ?		0 or 1 of previous token			a? → "", a
		 [ ]	Any one character inside			[abc] → a or b or c
		 [^]	Negation (not)				[^0-9] → anything except a digit
		 \d		Any digit (0–9)				\d → 5
		 \D		Non-digit					\D → a, @
		 \w		Word character (a–z, A–Z, 0–9, _)		\w → A, 3, _
		 \W		Non-word character				\W → @, #
		 \s		Whitespace					\s → space/tab/newline
	 	 ^		Start of line					^abc → line must start with abc
		 $		End of line					abc$ → line must end with abc
		{n}		Exactly n times values			a{3} → aaa
	 	{n,}	n or more times				a{2,} → aa, aaa
		{n,m}	Between n and m times			a{2,4} → aa, aaa, aaaa
		 `								OR condition
		()		Grouping					(ab)+ → abab
		*/
		
	}

}
