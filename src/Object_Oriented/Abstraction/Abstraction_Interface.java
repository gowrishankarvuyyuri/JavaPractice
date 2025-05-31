package Object_Oriented.Abstraction;

interface Interface {
	int a = 20;			//	--)		by default the variables are initialized with final and static
		//final static int a = 20;
	
	int sum(int a, int b);	//	--) 	a method with only signature, and by default it is treated as abstract method
		// abstract int sum(int a, int b);
	
	default int mult(int a, int b) {		
		return a*b;
	}
	
	default int mult1(int a, int b) {
		return a*b;
	}
	
	static int div() {
		return 6;
	}
}

class Class implements Interface {
	
	public int sum(int a, int b) {//		--)		abstract method implementation
		return a+b;			
	}
	
	@Override
	public int mult(int a, int b) {	//		--) 	overridden the default method from Interface make sure to change public
		return a*b*2;
	}
}

public class Abstraction_Interface extends Class{

	public static void main(String[] args) {
		
		//Interface.a = 20;	   --)	The final field Interface.a cannot be assigned
		int number = Interface.a;
		System.out.println(number);
		
		System.out.println(Interface.div());	//		--)  the static method can call directly from static and non static methods
		
	Class cl = new Class();
		System.out.println(cl.sum(2, 2));		//		--)		calling abstract method
		
		System.out.println(cl.mult(3, 2));		//		--)		calling overridden default method
	
		System.out.println(cl.mult1(3, 3));		//		--)		calling default method
	}

}
