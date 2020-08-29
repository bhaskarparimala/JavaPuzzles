package Optional;

import java.util.Optional;

import Java8.Student;
import Java8.StudentData;

public class OptionalOrElseExample {

	public static String optionalOrElse() {
		Optional<Student> student=Optional.ofNullable(StudentData.getAllStudents().get(1));
		String name= student.map(Student::getName).orElse("No ValuePresent");
		return name;
	}
	public static String optionalOrElse2() {
		Optional<Student> student=Optional.ofNullable(null);
		String name= student.map(Student::getName).orElse("No ValuePresent");
		return name;
	}
	public static String optionalOrElseGet() {
		Optional<Student> student=Optional.ofNullable(StudentData.getAllStudents().get(1));
		String name= student.map(Student::getName).orElseGet(()->"No ValuePresent");
		return name;
	}
	public static String optionalOrElseGet2() {
		Optional<Student> student=Optional.ofNullable(null);
		String name= student.map(Student::getName).orElseGet(()->"No ValuePresent");
		return name;
	}
	public static String optionalOrElseThrow() {
		Optional<Student> student=Optional.ofNullable(StudentData.getAllStudents().get(1));
		String name= student.map(Student::getName).orElseThrow(()->new RuntimeException("No ValuePresent"));
		return name;
	}
	public static String optionalOrElseThrow2() {
		Optional<Student> student=Optional.ofNullable(null);
		String name= student.map(Student::getName).orElseThrow(()->new RuntimeException("No ValuePresent"));
		return name;
	}
	public static void main(String arg[]) {
		
		System.out.println("orElse: "+optionalOrElse());//Stud name
		System.out.println("orElse: "+optionalOrElse2());//No Value Present
		System.out.println("orElseGet: "+optionalOrElseGet());//Stud name
		System.out.println("orElseGet: "+optionalOrElseGet2());//No Value Present
		System.out.println("orElseThrow: "+optionalOrElseThrow());//Stud name
		System.out.println("orElseThrow: "+optionalOrElseThrow2());//No Value Present Exception
	}
}
