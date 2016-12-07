package collection;

/***
 * Represents a student
 */
public class Student {

	private String name;
	private int gradeLevel;
	private boolean present;
	
	public Student(String name, int gradeLevel) {
		this.name = name;
		this.gradeLevel = gradeLevel;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean p) {
		this.present = p;
	}
	
	public String toString() {
		return name+" is a student in grade "+gradeLevel;
	}
}
