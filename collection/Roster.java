package collection;

/***
 *  Maintains a collection of students.  Provides a way
 *  to tally attendance.
 */
public class Roster {

	Student[] students;
	
	public Roster(Student[] students) {
		this.students = students;
	}
	
	public int tallyAbsences(){
		int tally = 0;
		for (int i = 0; i<students.length; i++) {
			if (!students[i].isPresent()) {
				tally++;
			}
		}
		return tally;
	}
}
