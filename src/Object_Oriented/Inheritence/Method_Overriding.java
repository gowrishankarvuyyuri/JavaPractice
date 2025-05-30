package Object_Oriented.Inheritence;

class Banks {
	int roi(int amount) {
		return amount * 10;
	}
}

class Hdfc extends Banks {
	@Override
	int roi(int amount) {
		return amount * 20;
	}
}
 	
public class Method_Overriding {

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		System.out.println(hdfc.roi(10));

	}

}
