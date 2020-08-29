package Java8.streams;

import Java8.StudentData;
import Java8.Student;
public class StreamMatchExample {

	public static boolean allMatch() {
		return StudentData.getAllStudents().stream()
		.allMatch(student->student.getGpa()>=3.9);
	}
	public static boolean anyMatch() {
		return StudentData.getAllStudents().stream()
		.allMatch(student->student.getGpa()>=3.5);
	}
	public static boolean noneMatch() {
		return StudentData.getAllStudents().stream()
		.allMatch(student->student.getGpa()>=4.2);
	}
	public static void main(String args[]) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}
}
