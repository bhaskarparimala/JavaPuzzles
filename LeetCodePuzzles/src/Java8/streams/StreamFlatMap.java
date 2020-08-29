package Java8.streams;

import java.util.List;

import Java8.Student;
import Java8.StudentData;
import static java.util.stream.Collectors.toList;
public class StreamFlatMap {

	public static List<String> printStudActivities(){
		List<String> studActivities=StudentData.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)// it will have Stream of activities with duplicate
		.collect(toList());
		return studActivities;
	}
	public static List<String> printStudDistinctActivities(){
		List<String> studActivities=StudentData.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.collect(toList());
		return studActivities;
	}
	public static long printStudDistinctCountActivities(){
		long count=StudentData.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct().count()
		;
		return count;
	}
	public static List<String> printStudDistinctSortedActivities(){
		List<String> studActivities=StudentData.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct().sorted()
				.collect(toList());
				return studActivities;
	}
	public static void main(String arg[]) {
	
		System.out.println("Activities: "+printStudActivities());
		System.out.println("Activities: "+printStudDistinctActivities());
		System.out.println("Activities: "+printStudDistinctSortedActivities());
		System.out.println("Activities: "+printStudDistinctCountActivities());
	}
}
