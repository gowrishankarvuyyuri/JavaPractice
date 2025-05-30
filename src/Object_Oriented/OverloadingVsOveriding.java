package Object_Oriented;

class Father {
	final int a = 10;
	void Name(String Name) {
		System.out.println("Father Name is " + Name);
	}
	
	void Name(String Name, String Names) {
		System.out.println("Names is " + Name + " " + Names);
	}
}

class Mother extends Father{
	void Name(int age, String Names) {
		System.out.println("Age is " +age+ " and Name is " +Names);
	}
}

class Sons extends Mother {
	@Override
	void Name(int age, String Names) {
		System.out.println("Names is " +Names+ " and age is " +age);
	}
	
	@Override
	void Name(String Name, String Names) {
		System.out.println("String is " +Name+ " and Name is " +Names);
	}
}

public class OverloadingVsOveriding {

	public static void main(String[] args) {
		
		Sons son = new Sons();
		son.Name(21,"Gowri Shankar");
		son.Name("Gowri Shankar");
		
		Mother mot = new Mother();
		mot.Name(21,"Gowri Shankar");
		mot.Name("Vuyyuri");
		mot.Name("Gowri", "Shankar");
		
		son.Name("Gowri", "Shankar");
	}

}
