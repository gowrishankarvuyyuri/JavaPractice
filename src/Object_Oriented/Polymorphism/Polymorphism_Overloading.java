package Object_Oriented.Polymorphism;

class Overloading {
	
	int a = 10, b = 20;
	
	public void addition() {
		System.out.println(a+b);
	}
	
	//same method called with two paramerts
	public void addition(int n, int m){
		System.out.println(a+b+n+m);
	}
	
	//same method with two parameters and with differnt dataTypes
	public void addition(int n, String str) {
		System.out.println(a+b+n+" "+str);
	}
	
	//same method called two paramters and dataTypes with diiferent Order
	public void addition(String Str, int n) {
		System.out.println(Str +" "+(a+b+n));
	}
	
	
}

public class Polymorphism_Overloading {
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.addition();
		o.addition(20, 20);
		o.addition(20, "Gowri");
		o.addition("Shankar", 20);
	}
}
