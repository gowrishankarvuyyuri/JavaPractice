package ObjectOriented;
class A {
	static int age = 10;
	static void string(String name) {
		System.out.println("My Name is " +name);
	}
}

class B extends A {

	static void string(String name) {
		System.out.println(name +" is my Name");
	}
}

public class StaticKeyword {

	static int num = 10; //static variable
	int b = 20; // non static variable
	
	static void method() {
		System.out.println("This is a static method");
	}
	
	void method2() {
		System.out.println("This is a non-static method");
	}
	
	void method3() {
		System.out.println("non-static method can access all static and non-static variables and methods through internally");
		System.out.println(num);
		System.out.println(b);
		method();
		method2();
	}
	
	public static void main(String[] args) {	
		/*
		System.out.println(num); // can directly access without creating any object
		method();
		
		StaticKeyword stat = new StaticKeyword();
		StaticKeyword stat2 = new StaticKeyword();
		StaticKeyword.num = 20;
		System.out.println(stat2.num);
		
		System.out.println(stat.b); // static methods can access non-static through object reference
		stat.method2();
		
		stat.method3(); // called non-static method to print all static and non-static variables and methods in class/object
		*/
		
		A.string("Gowri Shankar");
		B.string("Gowri Shankar");
		StaticKeyword.num = 40;
		B.age = 20; 
		System.out.println(A.age);
		
		
		
	}

}
