package inheritance;

public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student("Mario", 12);
		Student s2 = new TransferStudent("Luigi", 12, s1);
		TransferStudent s3 = new TransferStudent("Peach", 11);
		Student[] students = {s1, s2, s3};
		for (Student s: students) {
			System.out.println(s);
		}
	}
}
