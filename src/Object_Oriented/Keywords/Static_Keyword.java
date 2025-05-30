package Object_Oriented.Keywords;

/*
 static methods can access other static members directly  
 static methods can access non - static members through object only
 */

class Static {
	
	public static String staticString = "Gowri Shankar Vuyyuri";
	public String normalString = "Divya Vuyyuri";
	
	public static void display() {
		System.out.println(staticString);
	}
	
	public void show() {
		System.out.println(normalString);
	}
	
 }

class nonStatic {
	
	public void nonStatic() {
		Static.staticString = "Gowri Shankar Vuyyuri";
		Static.display();
			
		Static s = new Static();
		s.normalString = "Divya Vuyyuri";
		s.show();
	}
}


public class Static_Keyword {

	public static void main(String[] args) {
		
		//static methods can access other static members with classname
		Static.staticString = "gowri shankar vuyyuri";
		Static.display();
		
		//static methods can acess non-static members by only through object reference
		Static s = new Static();
		s.normalString = "divya vuyyuri";
		s.show();
		
		//non-static methods can access directly static members, and with non-static members can acess through object reference
		nonStatic n = new nonStatic();
		n.nonStatic();
	}

}
