package Java_Practice_Labs;

public class Frequency_Words {

	public static void main(String[] args) {
		String string = "Gowri Shankar is Gowri Shankar";
		String[] stringSplit = string.split(" ");
		
		for(int i = 0; i < stringSplit.length; i++) {
			int count = 0;
			for(int j = i+1; j < stringSplit.length; j++) {
				if(stringSplit[i].equalsIgnoreCase(stringSplit[j]))
				{
					count++;
					stringSplit[j] = "";
				}
			}
			if((!stringSplit[i].equals("")) && count > 0) {
				System.out.println(stringSplit[i] + " Repeated " + (count+1));
			}
		}
		
		
	}
}
