package ObjectOriented;

interface InterfaceMethod {
	
	//by default those are final and static variables
	int len = 10; 		
	int width = 20;
	
	//abstract method can only have signature and by default those are public to the interface
	int square(int num);
	
	//default method by explicity putttin default access modifier to the interface method
	default int multi(int a, int b) {
		return a*b;
	}
	
	//static method
	static int cross(int a, int b, int c) {
		return a*b*c;
	}
	
}
public class InterfaceClass implements InterfaceMethod{
	
	// once created the abstract method in class, had to implement the logic along with place public
	public int square (int num) {
		return num*num;
	}

	public static void main(String[] args) {
		
		// can directly access static variables and methods without creating any objects
		System.out.println(InterfaceMethod.len + InterfaceMethod.width);
		System.out.println(InterfaceMethod.cross(2, 3, 4));
		
		//object reference through class
		InterfaceClass interf = new InterfaceClass();
		System.out.println(interf.multi(2, 2));
		System.out.println(interf.square(2));
		
		//object reference variable for interface
		InterfaceMethod inter =new InterfaceClass();
		System.out.println(inter.square(2));
		System.out.println(inter.multi(2, 2));

	}

}
