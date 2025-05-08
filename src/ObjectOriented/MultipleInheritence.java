package ObjectOriented;

class GrandParent {
	
	String name;
	void display() {
		System.out.println("Grand Parent Name : "+name);
	}
}

class Parents extends GrandParent{
	
	String names;
	void print() {
		System.out.println("Parent Name : "+names);
	}
}

class Childs extends Parents{
	String namess;
	void getchild() {
		System.out.println("Child Name : "+namess);
	}
}

public class MultipleInheritence {

	public static void main(String[] args) {
		
		Childs child = new Childs();
		
		child.name = "Venkayya";
		child.names = "Rambabu";
		child.namess = "Gowri Shankar";
		
		child.display();
		child.print();
		child.getchild();
	}

}
