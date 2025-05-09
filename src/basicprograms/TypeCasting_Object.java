package basicprograms;

class A{
	int a = 10;
}

class B extends A {
	int b = 20;
}
public class TypeCasting_Object {

	public static void main(String[] args) {
		
		//retrieving values at normal initialization
		B b = new B();
		System.out.println(b.b);
		System.out.println(b.a);
		
		System.out.println();
		
		//upcasting the object initialization
		A a = new B(); // we can refer the parent class reference to child object, since it is base class
		System.out.println(a.a);
		//System.out.println(a.b); // through 'a' we can only aquire the prop from parent only
		System.out.println();
		
		//downcasting the object, will not be possible
		//B bb = new A(); // 'bb' cannot hold the object of Parent/base class, cause it was derived class
		A aa = new A();
		B bb =(B) aa;
		System.out.println(bb.a);
		System.out.println(bb.b);
		
		
	}	

}
