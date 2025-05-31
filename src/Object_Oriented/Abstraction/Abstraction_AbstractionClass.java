package Object_Oriented.Abstraction;

abstract class parentAbstraction {
	
	static int a = 10;
	
	abstract void parentMethod();
	
	final void child() {
		System.out.println("Insdide child");
	}
}

class ChildAbstraction extends parentAbstraction{

	public void parentMethod() {
		System.out.println("Inside parentMethod Override one");
	}
}

public class Abstraction_AbstractionClass{

	public static void main(String[] args) {
		
		ChildAbstraction ca = new ChildAbstraction();
		ca.parentMethod();
		ca.child();
	}

}
