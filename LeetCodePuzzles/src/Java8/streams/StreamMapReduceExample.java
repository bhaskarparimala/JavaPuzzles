package Java8.streams;

import Java8.Student;
import Java8.StudentData;
public class StreamMapReduceExample {

	private static int numberOfBooks() {
	return	StudentData.getAllStudents().stream()
		.map(Student::getNoteBooks)
		.reduce(0, (a,b)->a+b);
	}
	
	private static int numberOfBooks2() {
		return	StudentData.getAllStudents().stream()
			.filter(student->student.getGradeLevel()>=3)
			.map(Student::getNoteBooks)
			.reduce(0, (a,b)->a+b);
		}
	public static void main(String arg[]) {
		System.out.println("Total NumberofBooks: "+numberOfBooks());
		System.out.println("Total NumberofBooks: "+numberOfBooks2());
	}
}
