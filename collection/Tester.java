package collection;

/***
 * Creates a roster with sample data and tests the tally method.
 *
 */
public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student("Annabelle", 10);
		Student s2 = new Student("Bradford", 12);
		Student s3 = new Student("Curtis", 11);
		Student s4 = new Student("Douglass", 9);
		Student s5 = new Student("Erma", 12);
		s1.setPresent(true);
		s2.setPresent(false);
		s3.setPresent(true);
		Student[] data = {s1, s2, s3, s4, s5}; 
		Roster r = new Roster(data);
		int numMissing = r.tallyAbsences();
		System.out.println("Today's absences: "+ numMissing);
	}
}
