package Object_Oriented.Keywords;

class Super1 {
	int a = 10;
	
	Super1(String name) {
		System.out.println("Inside Super1 constructor");
	}
	
	void superMethod() {
		System.out.println("Inside Super1 method");
	}
}

class Super2 extends Super1{
	int a = 20;
	Super2() {
		super("Gowri");		//		--)			invoking the immediate parent constructor
		System.out.println("Inside Super2 constructor");
	}
	
	void superMethod() {
		super.superMethod();	//	--)			invoking the parent original method rather than overridden 
		System.out.println("Inside Super2 method");
	}
	void superVariable() {
		System.out.println(super.a);
		System.out.println(a);
	}
}


public class Super_Keyword {

	public static void main(String[] args) {
			
		Super2 s2 = new Super2();
		s2.superMethod();
		s2.superVariable();
	}

}
