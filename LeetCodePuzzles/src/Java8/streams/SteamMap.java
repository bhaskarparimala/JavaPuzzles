package Java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

import Java8.StudentData;
import Java8.Student;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
public class SteamMap {

	public static List<String> namesList(){
	List<String> studNames=	StudentData.getAllStudents().stream()
		.map(Student::getName)
		 .collect(toList());//collected in to List
	return studNames;
	}
	
	public static Set<String> namesSet(){
		Set<String> studNames=	StudentData.getAllStudents().stream()//Stream of Students
			.map(Student::getName)//Steam of strings
			.map(String::toUpperCase)//operations on String
			 .collect(toSet());//collected in to set
		return studNames;
		}
	
	public static void main(String arg[]) {
		
		System.out.println("Stud List: "+namesList());
		System.out.println("Stud List: "+namesSet());
	}
}
