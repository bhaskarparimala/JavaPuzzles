package Optional;

import java.util.Optional;

import Java8.Student;
import Java8.StudentData;

public class OptionalPresentExample {

	
	public static void main(String arg[]) {
	
		
		Optional<String> obj= Optional.ofNullable("bhaskar");
		System.out.println("obj value: "+obj.isPresent());//true
		Optional<String> obj2= Optional.ofNullable(null);
		//System.out.println("obj value: "+obj2.isPresent());//false
		//ifpresent
		Optional<Student> studentObj = Optional.ofNullable(StudentData.getAllStudents().get(1));
		System.out.println("Is Student Object present: "+studentObj.isPresent());
		studentObj.ifPresent(s->System.out.println(s.getName()));
	}
}
