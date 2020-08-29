package Java8.streams;
import java.util.Optional;

import Java8.Student;
import Java8.StudentData;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent(){
		return
		StudentData.getAllStudents().stream()
		.filter(student->student.getGpa()>=3.9)//it iterates over the steam
		//and as soon as it found first matching condition element it will return that element.
		.findAny();
	}
	public static Optional<Student> findFirstStudent(){
		return
		StudentData.getAllStudents().stream()
		.filter(student->student.getGpa()>=3.9)//it iterates over the steam
		//and as soon as it found first matching condition element it will return that element.
		.findFirst();
	}
	public static void main(String arg[]) {
		Optional<Student> studResult = findAnyStudent();
		if(studResult.isPresent()) {
			System.out.println("Student: "+studResult.toString());
		}
		else {
			System.out.println("No Student found ");
		}
		Optional<Student> studResultFindFirst = findAnyStudent();
		if(studResultFindFirst.isPresent()) {
			System.out.println("Student: "+studResultFindFirst.toString());
		}
		else {
			System.out.println("No Student found ");
		}
	}
}
