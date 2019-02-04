
public class Student extends School {
	private String studentName;
	public Student(String name, int age, String principal, String studentName) {
		super(name, age, principal);
		this.studentName=studentName;
	}
	public void learn() {
		System.out.println("You went to school and learned something!");
	}
	public void graduate() {
		System.out.println("You graduated from high school.");
	}
}
