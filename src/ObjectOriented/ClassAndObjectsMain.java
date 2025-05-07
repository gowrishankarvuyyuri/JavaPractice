package ObjectOriented;
import basicprograms.ClassCreation;

public class ClassAndObjectsMain {

	public static void main(String[] args) {
		
		//ClassAndObjects person = new ClassAndObjects();
		
		/*
		person.method(); // No-Arguments and No-Return
		
		String Name = person.method1(); // No-Arguments and Return values
		System.out.println(Name);
		
		String newName = person.method2("Gowri"); // Arguments and Return values
		System.out.println(newName);
		
		person.method3("Gowri Shankar"); // Arguments with no return value
		*/
		
		
		//using object reference
		/* 
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
		*/
		
		/*
		ClassCreation male = new ClassCreation();
		male.person_id = 19;
		male.person_name = "Gowri Shankar";
		male.person_add = "Nattarameswaram";
		
		male.display();
		
		ClassCreation female = new ClassCreation();
		female.person_id = 20;
		female.person_name = "Divya Padam";
		female.person_add = "Hyderabad";
		
		female.display();
		*/
		
		//using method reference
		/*
		ClassAndObjects female = new ClassAndObjects();
		
		female.setPersondata(21, "Divya Padam", "Hyderabad");
		female.display();
		
		
		//using constructor
		ConstructorClass person = new ConstructorClass(21, "Divya");
	
		person.display();
		*/
		
		//Method Overloading through Polymorphism
		/*
		Polymorphism_Overloading method = new Polymorphism_Overloading();
		
		method.addition(); 
		method.addition(5,5);
		method.addition(5, "Gowri");
		method.addition("Shankar", -5);
		*/
		
		//Constructor Overloading through Polymorphism
		/*
		Polymorphism_Overloading method = new Polymorphism_Overloading();
		Polymorphism_Overloading method1 = new Polymorphism_Overloading(15,5);
		Polymorphism_Overloading method2 = new Polymorphism_Overloading(15,5.5);
		Polymorphism_Overloading method3 = new Polymorphism_Overloading(15.6,6);
		*/
	}

}
