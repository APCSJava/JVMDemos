package inheritance;
/***
 * Transfer students are assigned a buddy
 */
public class TransferStudent extends Student {
	
	private Student buddy;

	public TransferStudent(String name, int gradeLevel) {
		super(name, gradeLevel);
	}
	
	public TransferStudent(String name, int gradeLevel, Student s){
		super(name, gradeLevel);
		buddy = s;
	}
	
	public Student getBuddy() {
		return buddy;
	}
	
	public void setBuddy(Student s) {
		buddy = s;
	}
	
	public String toString() {
		return super.toString()+"\n\tBuddy: "+buddy.getName();
	}

}
