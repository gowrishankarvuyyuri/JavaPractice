package Object_Oriented;

class Xx {
	public int age;
	public String name;
	
	public void classA(String personName, int personAge) {
		age = personAge;
		name = personName;
		System.out.println(age + " -) " + name);
	}
	
	public void display() {
		System.out.println(age + " -) " + name);
	}
}

public class Class_And_Objects {

	public static void main(String[] args) {
		
		Xx x = new Xx();
		x.classA("Gowri Shanakr", 24);
		
		x.age = 29;
		x.name = "Divya";
		x.display();
	}

}
