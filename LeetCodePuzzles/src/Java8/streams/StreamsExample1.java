package Java8.streams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Java8.Student;
import Java8.StudentData;
public class StreamsExample1 {
public static void main(String arg[]) {
	Map<String,List<String>> students=StudentData.getAllStudents().stream()
	.collect(Collectors.toMap(Student::getName,Student::getActivities));
	System.out.println("students: "+students);
	
	//print only studetns having greater GRADE 3
	
	Map<String,List<String>> students2=StudentData.getAllStudents().stream()//stream<Students>
			.filter(student->student.getGradeLevel()>3)//stream<Students>
			.filter(student->student.getGpa()>2)//stream<Students>
			.collect(Collectors.toMap(Student::getName,Student::getActivities));//Map
			System.out.println("students: "+students2);
}
}
