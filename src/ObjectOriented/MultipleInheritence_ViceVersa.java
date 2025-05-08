package ObjectOriented;

abstract class Aa {
	abstract void abs1();
}

abstract class Cc {
	abstract void abs2();
}

class Bb{
	void method2() {
		System.out.println("method2 called..");
	}
}


interface I1 {
	void method();
	static void method3() {
		System.out.println("Method3 called..");
	}
}

interface I2{
	void method();
	default void method4() {
		System.out.println("Method4 called..");
	}
}

public class MultipleInheritence_ViceVersa extends Bb implements I1,I2{

	public void method() {
		System.out.println("Method Called..");
	}
	void method2() {
		System.out.println("Method2 Called..");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritence_ViceVersa m = new MultipleInheritence_ViceVersa();
		/*
		m.method();
		m.method2();
		*/
		m.method2();
		
		I1 i1 = new MultipleInheritence_ViceVersa();
		i1.method();
		I1.method3();
		
		I2 i2 = new MultipleInheritence_ViceVersa();
		i2.method();
		i2.method4();
	}

}
