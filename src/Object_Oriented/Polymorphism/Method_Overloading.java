package Object_Oriented.Polymorphism;

class A{
	public void add() {
		System.out.println("Inside add()");
	}
}

class B extends A {
	public void add(int n) {
		System.out.println("Inside add(int)");
	}
}

class C extends B {
	public void add(int n, int m) {
		System.out.println("Inside add(int, int)");
	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		
		C c = new C();
		c.add();
		c.add(2);
		c.add(2, 0);
	}

}
