package Object_Oriented.Inheritence;

class Rambabu {
	
	String name = "Rambabu";
	void display() {
		System.out.println("Parent Name is " +name);
	}
}

class Daughter extends Rambabu {
	String names = "Divya";
	void print() {
		System.out.println(name + " Daughter Name is "+names);
	}
}

class Son extends Rambabu{
	String namess = "Gowri Shankar";
	void getdata() {
		System.out.println(name+" Son Name is " + namess);
	}
}
public class Hierarchy_Inheritence {

	static public void main(String[] a) {
		Son son = new Son();
		son.display();
		son.getdata();
		
		Daughter daughter = new Daughter();
		daughter.display();
		daughter.print();
	}
}
