package Object_Oriented;

class Method {
	
	public String str = "Gowri";
	
	//with parameters and with return type
	public String method1(String name) {
		String newName = name.concat(" Shankar");
		return newName;
	}
	
	//with params, without return type
	public void method2(String name) {
		String newName = name.concat(" Shankar");
		System.out.println(newName);
	}
	
	//without param, with return type
	public String method3() {
		String newName = str.concat(" Shankar");
		return newName;
	}
	
	//without param, without return type
	public void method4() {
		String newName = str.concat(" Shankar");
		System.out.println(newName);
	}
}

public class Methods_With_Types {

	public static void main(String[] args) {
	
		Method m = new Method();
		
		String newName = m.method1("Gowri");
		System.out.println(newName);
		
		m.method2("Gowri");

		String newName1 = m.method3();
		System.out.println(newName1);
		
		m.method4();
	}

}
