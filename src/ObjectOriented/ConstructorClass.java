package ObjectOriented;

public class ConstructorClass {
	int p_id;
	String p_name;
	
	ConstructorClass(int id, String name){
		p_id = id;
		p_name = name;
	}
	
	void display() {
		System.out.println("Id " +p_id+ " Name " +p_name);
	}
}
