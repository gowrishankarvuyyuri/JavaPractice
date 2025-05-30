package Object_Oriented;

class Constructor {
	
	public int age = 29;
	public String name = "Divya";
	
	//default Constructor
	public Constructor() {
		System.out.println("Into the default constructor");
		System.out.println(age + name);
		System.out.println();
	}
	
	//parameterized constructor
	public Constructor(String Name, int Age) {
		name = Name;
		age = Age;
		System.out.println("Into the parameterized constructor");
		System.out.println(age + name);
	}
	
	//overloading the contructor class
	public Constructor(int Age, String Name) {
		name = Name;
		age = Age;
		System.out.println("Into the parameterized constructor");
		System.out.println(age + name);
	}
	
}

public class Constructor_Class {
	
	public static void main(String [] args) {
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor("Gowri", 24);
		Constructor c2 = new Constructor(29, "Divya");
	}
}
