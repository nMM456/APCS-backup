
public abstract class School {
	private String name;
	private int age;
	private String principal;
	
	public School(String name, int age, String principal) {
		this.name = name;
		this.age=age;
		this.principal = principal;
	}
	public void age() {
		age++;
	}
	public String toString() {
		return name + "is "+age+" years old. The principal is "+principal+".";
	}

}
