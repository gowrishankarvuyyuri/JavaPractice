package ObjectOriented;

class Final1 {
	final int x = 100;
	void method() {
		System.out.println("Normal Method");
	}
}

class Final2 extends Final1 {
	int x = 200;
	@Override
	void method() {
		System.out.println("Extended Method");
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		
		Final2 fin2 = new Final2();
		fin2.x = 20; // we can change since x is normal
		System.out.println(fin2.x); 
		fin2.method(); //we cannot overide due to final method
		
		Final1 fin1 = new Final1();
		//fin1.x = 20; // we cannot change the since int x is set to final
	}

}
