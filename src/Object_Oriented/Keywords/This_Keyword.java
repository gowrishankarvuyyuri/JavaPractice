package Object_Oriented.Keywords;

class This {
	public String name = "Gowri Shankar";
	This(String name) {
		this.name = name;
	}
	void display() {
		System.out.println(name);
	}
}

public class This_Keyword {

	public static void main(String[] args) {
	
		This th = new This("gowri shankar");
		th.display();
	}
}
