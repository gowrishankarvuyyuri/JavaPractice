package Object_Oriented;

class X {
	X() {
		System.out.println("Parent Class");
	}
	static int a = 10;
	void display() {
		System.out.println(a);
	}
}

class Y extends X{
	Y(){
		super();
		System.out.println("Child Class");
	}
	static int a = 20;
	void display() {
		super.display();
	}
	void print() {
		System.out.println(super.a);
	}
}

public class SuperKeyword {
	
	public static void main(String args[]) {
		Y.a = 30;
		X x = new X();
		x.display();
		
		Y y = new Y();
		y.display();
		y.print();
	}
}
