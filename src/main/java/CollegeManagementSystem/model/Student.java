package CollegeManagementSystem.model;

public class Student {

	private String name;
	private int age;
	private String subject;
	private String collegename;
	public Student() {
		super();
	}
	public Student(String name, int age, String subject, String collegename) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.collegename = collegename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
