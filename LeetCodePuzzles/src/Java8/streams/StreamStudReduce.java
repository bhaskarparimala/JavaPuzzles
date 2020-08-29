package Java8.streams;
import java.util.Optional;

import Java8.Student;
import Java8.StudentData;
public class StreamStudReduce {
//print the highest GPA student
	
	public static Optional<Student> printHighGpaStudent() {
		return StudentData.getAllStudents().stream()
		.reduce((s1,s2)->{
			if(s1.getGpa()>s2.getGpa())
				return s1;
				else
					return	s2;
		});
	}
	
	public static Optional<Student> printHighGpaStudent2() {
		return StudentData.getAllStudents().stream()
		.reduce((s1,s2)->
			(s1.getGpa()> s2.getGpa() ? s1 : s2)
		);
	}
	
	public static void main(String arg[]) {
		System.out.println("Hig Gpa Student: "+printHighGpaStudent());
		System.out.println("Hig Gpa Student2: "+printHighGpaStudent());
	}
}
