package Java8.streams;

import Java8.StudentData;

import java.util.List;

import Java8.Student;
import static java.util.stream.Collectors.toList;
public class StreamFilters {

	public static List<Student> printFemaleStuds(){
		return StudentData.getAllStudents().stream()
		.filter(student->student.getGender().equals("female"))
		.collect(toList());
		
	}
	public static void main(String arg[]) {
		// TODO Auto-generated method stub
		System.out.println("Students "+ printFemaleStuds());
	}
}
