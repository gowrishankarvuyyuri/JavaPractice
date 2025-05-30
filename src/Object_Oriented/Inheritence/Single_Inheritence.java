package Object_Oriented.Inheritence;


class Parent {
	
	String name = "Rambabu";
	void display() {
		System.out.println("Parent Name : "+name);
	}
}

class Child extends Parent{
	
	String names = "Gowri Shankar";
	void print() {
		System.out.println("Child Name : "+names);
	}
}

public class Single_Inheritence {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		System.out.println(child.name);
		System.out.println(child.names);
		
		child.display();
		child.print();
		
	}

}
