package basicprograms;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 71;
		boolean prime = true;
		
		for (int i = 2; i < input/2; i++) {
			if (input % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println("Number "+input+ " is "+ (prime? "Prime Number" : "Non-Prime Number"));
	}
}
