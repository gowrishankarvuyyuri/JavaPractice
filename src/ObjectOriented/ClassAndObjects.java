package ObjectOriented;

public class ClassAndObjects {
	
	/*Method with No arguments and No return values
	public void method() {
		System.out.println("Hello myself Gowri Shankar");
	}
	
	/*Method with No arguments and return values
	public String method1() {
		return "Hello myself Gowri Shankar Vuyyuri";
	}
	
	/*Method with arguments and return values
	public String method2(String name) {
		return "Hello myself " + name;
	}
	
	/*Method with arguments and return value
	public void method3(String name) {
		System.out.println("Hello myself " + name);
	}
	*/
	
	
	/* assigning values to the class variables through object reference
	 
	int person_id;
	String person_name;
	String person_add;
	
	public void display(){
		System.out.println("ID - " +person_id+ "\t    Person Name - " +person_name+ "\t   Person_add - " +person_add);
	}
	public static void main(String[] args) {
		
		ClassAndObjects male = new ClassAndObjects();
		male.person_id = 19;
		male.person_name = "Gowri Shankar";
		male.person_add = "Nattarameswaram";
		
		male.display();
		
		
		ClassAndObjects female = new ClassAndObjects();
		female.person_id = 20;
		female.person_name = "Divya Padam";
		female.person_add = "Hyderabad";
		
		female.display();
		
	}
	*/
	
	
	//assigning values through method reference
	int person_id;
	String person_name;
	String person_add;
	
	public void display(){
		System.out.println("ID - " +person_id+ "\t    Person Name - " +person_name+ "\t   Person_add - " +person_add);
	}
	
	public void setPersondata(int id, String name, String add) {
		person_id = id;
		person_name = name;
		person_add = add;
	}
}
