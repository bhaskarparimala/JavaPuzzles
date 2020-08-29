package Optional;
import Java8.StudentData;

import java.util.Optional;

import Java8.Student;
public class OptionalExample1 {

	public static String studentName() {
		Student studentObj=StudentData.getAllStudents().get(1);
		if(studentObj!=null) {
			return studentObj.getName();
		}
		else
			return null;
		
	}
	
	public static Optional<String> studentNameOptional() {
		Optional<Student> studentObj=Optional.ofNullable
							( StudentData.getAllStudents().get(1));
		if(studentObj.isPresent()) {
			return studentObj.map(Student::getName);
		}
		else
			return Optional.empty();
		
	}
	public static void main(String args[]) {
		
		Optional<String> studOptional=studentNameOptional();
		if(studOptional.isPresent()) {
			System.out.println("Lenth of Name: "+ studOptional.get().length());
		}
		else
			System.out.println("Name not found ");
	}
}
