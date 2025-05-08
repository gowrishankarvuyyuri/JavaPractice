package ObjectOriented;

import Strings.Check;

class Banks {
	double roi(int amount) {
		return amount * 10.5;
	}
}
/*
class Hdfc extends Check {
	@Override
	protected double roi(int amount) {
		return amount * 11.5;
	}
}
*/
class Hdfc extends Banks {
	@Override
	protected double roi(int amount) {
		return amount * 11.5;
	}
}
 	
public class MethodOverriding {

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		System.out.println(hdfc.roi(10));

	}

}
