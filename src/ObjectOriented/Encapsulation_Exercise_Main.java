package ObjectOriented;

public class Encapsulation_Exercise_Main {

	public static void main(String[] args) {
		
		/*
		Encapsulation_Exercise bank = new Encapsulation_Exercise(21, "GowriShankar", "Attili");
		
		bank.setAct_no(100);
		bank.setName("Gowri Shankar");
		bank.setBranch("Attili");
		
		int Acc_Num = bank.getAct_no();
		System.out.println("Account Number : " + Acc_Num);
		
		String Name = bank.getName();
		System.out.println("Account Holder Name : " + Name);
		
		String Branch = bank.getBranch();
		System.out.println("Account Branch Name : " + Branch);
		
		bank.display();
		*/
		System.out.println(StaticKeyword.num); // can directly access without creating any object
		StaticKeyword.method();
	}

}
