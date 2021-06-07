package CollegeManagementSystem.model;

public class College {

	private String collegename;
	private int strength;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public College() {
		super();
	}
	public College(String collegename, int strength) {
		super();
		this.collegename = collegename;
		this.strength = strength;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}

}
