package ObjectOriented;

public class Encapsulation_Exercise {
	
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

	Encapsulation_Exercise(int num, String holder, String loc) {
		act_no = num;
		name = holder;
		branch = loc;
	}
	
	void display() {
		System.out.println("Account Number : " +act_no+ "\nAccount Holder Name : " +name+ "\nAccount Branch Name : "+ branch);
	}
}
