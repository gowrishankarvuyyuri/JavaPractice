package ObjectOriented;

public class Polymorphism_Overloading {
	
	//Method Overloading
	/*
	int a = 10, b = 20;
	
	public void addition() {
		System.out.println(a+b);
	}
	
	//same method called through diff in number of arguments
	public void addition(int n, int m){
		System.out.println(a+b+n+m);
	}
	
	//same method called through diff types of parameters
	public void addition(int n, String str) {
		System.out.println(a+b+n+" "+str);
	}
	
	//same method called in diff order of parameters
	public void addition(String Str, int n) {
		System.out.println(Str +" "+(a+b+n));
	}
	*/
	
	//Constructor Overloading
	int a, b;
	double c;
	
	Polymorphism_Overloading() {
		a=10; b=20;
		System.out.println(a+b);
	}
	
	Polymorphism_Overloading(int x, int y) {
		a=x; b=y;
		System.out.println(a+b);
	}
	
	Polymorphism_Overloading(int x, double y) {
		a=x; c=y;
		System.out.println(a+b);
	}
	
	Polymorphism_Overloading(double x, int y) {
		c=x; a=y;
		double z = c+a;
		System.out.println(z);
	}
}
