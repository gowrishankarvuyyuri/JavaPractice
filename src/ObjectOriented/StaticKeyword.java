package ObjectOriented;

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
		System.out.println(num); // can directly access without creating any object
		method();
		
		StaticKeyword stat = new StaticKeyword();
		System.out.println(stat.b); // static methods can access non-static through object reference
		stat.method2();
		
		stat.method3(); // called non-static method to print all static and non-static variables and methods in class/object
	}

}
