package Java_Basics;

class A{
	int a = 10;
}

class B extends A {
	static int b = 20;
}

public class TypeCasting_Object {

	public static void main(String[] args) {
		
		//normal object initialization
		B b = new B();
		System.out.println(b.b);
		System.out.println(b.a);
		
		//upcasting the object
		A a = new B();						 // we can refer the parent class reference to child object, since it is base class
		//  System.out.println(a.b); 		--) through 'a' we can only aquire the prop from parent only
		int val = a.a;
		
		//downcasting the object - not possible even it doesn't have compile time errors, but at runtime we got ClassCastException
		
		//B bb = new A(); 					--) 'bb' cannot hold the object of Parent/base class, cause it was derived class
		
		A aa = new A();
		B bb =(B) aa;
		System.out.println(bb.a);
		System.out.println(bb.b);
		
	}	

}
