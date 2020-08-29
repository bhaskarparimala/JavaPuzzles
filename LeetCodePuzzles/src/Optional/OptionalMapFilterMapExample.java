package Optional;

import java.util.Optional;

import Java8.Bike;
import Java8.Student;
import Java8.StudentData;

public class OptionalMapFilterMapExample {

	public static void studentName(){
		Optional<Student> studObj=Optional.ofNullable(StudentData.getAllStudents().get(1));
		studObj.filter(student -> student.getGpa()>=3)
		.ifPresent(stud -> System.out.println(stud.getName()));
		
	}
	public static void studentNameMap(){
		Optional<Student> studObj=Optional.ofNullable(StudentData.getAllStudents().get(1));
		Optional<String> name=studObj.filter(student -> student.getGpa()>=3)
		.map(Student::getName);
		System.out.println(name.get());
		
	}
	
	public static Optional<String> optionalFlatMap() {
		Optional<Student> studentOptional=
				Optional.ofNullable(StudentData.sutudentSupplier.get());
		Optional<String> bikeName=studentOptional
		.filter(student->student.getGpa()>=3.5)//Optional<Student <Optional <Bike>>
		.flatMap(Student::getBike)//Optional<Bike>
		.map(Bike::getName);
		return bikeName;
		
	}
	
	public static void main(String arg[]) {
	
		studentName();
		studentNameMap();
		
		System.out.println("Optional Bike Nme: "+optionalFlatMap().get());
	}
}
