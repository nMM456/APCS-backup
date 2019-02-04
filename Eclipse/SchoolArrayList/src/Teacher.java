
public class Teacher extends School {
	private String teacherName;
	private boolean retired;
	public Teacher(String teacherName, String name, int age, String principal) {
		super(name, age, principal);
		this.teacherName = teacherName;
		retired=false;
	}
	public void teach() {
		if (!retired) System.out.println("The students were taught.");
		else System.out.println("You subbed in for a teacher.");
	}
	public void retire() {
		System.out.println("You retired.");
		retired=true;
	}
	

}
