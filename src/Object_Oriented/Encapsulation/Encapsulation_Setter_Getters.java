package Object_Oriented.Encapsulation;

class Enacapsulation {
	
	private int act_no;
	private String name;
	private String branch;
	
	public int getAct_no() {
		return act_no;
	}

	public void setAct_no(int act_no) {
		this.act_no = act_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}

public class Encapsulation_Setter_Getters {

	public static void main(String[] args) {
		
		Enacapsulation e = new Enacapsulation();
		
		//settingUp the data
		e.setAct_no(123);
		e.setName("Gowri Shankar");
		e.setBranch("Attili");
		
		//geeting the data
		int account = e.getAct_no();
		String name = e.getName();
		String branch = e.getBranch();
		
		System.out.println(account + "," + name + "," + branch);
	}

}
