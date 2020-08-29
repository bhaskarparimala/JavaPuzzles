package Java8.streams;
import Java8.Student;
import Java8.StudentData;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
public class StreamCustomSort {
	public static List<Student> printStudBySort(){
		List<Student> studActivities=StudentData.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(toList());
		return studActivities;
	}
	
	public static List<Student> printStudSortByGpa(){
		List<Student> studActivities=StudentData.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(toList());
		return studActivities;
	}
	
	public static List<Student> printStudSortByGpaDescending(){
		List<Student> studActivities=StudentData.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(toList());
		return studActivities;
	}
	public static void main(String arg[]) {
		System.out.println("Students sort by name: ");
		printStudBySort().forEach(System.out::println);
		System.out.println("Students sort by GPA: ");
		printStudSortByGpa().forEach(System.out::println);
		System.out.println("Students sort by GPA Descending: ");
		printStudSortByGpaDescending().forEach(System.out::println);
	}
}
