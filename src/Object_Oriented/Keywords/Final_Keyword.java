package Object_Oriented.Keywords;

class Final {
	final int num = 10;
	final void display() {
		System.out.println(num);
	}
}

class Final1 extends Final{
	int num = 20;
	
	/*			
	void display() {	   --)			Cannot override the final method from Final
		System.out.println(num);			
	}
	*/
}

public class Final_Keyword {

	public static void main(String[] args) {
		
		Final f = new Final();
		//f.num = 20;		--)			The final field Final.num cannot be assigned
		f.display();
		
		
	}
}

final class A {
	void display() {
		System.out.println("Inside class A");
	}
}

/*
class B extends A {			--)			The type B cannot subclass the final class A			
	void display() {
		System.out.println("Inside class B");
	}
}
*/















