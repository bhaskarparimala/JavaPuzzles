package Java8.DefaultMethods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import Java8.Student;
import Java8.StudentData;

public class DefaultMethodWithComparator {
	
	static Consumer<Student> studentConsumer = (student->System.out.println(student));
	
	public static void sortByName(List<Student> studList) {
		Comparator<Student> studComparator= Comparator.comparing(Student::getName);
		studList.sort(studComparator);
		studList.forEach(studentConsumer);
	}
	public static void sortByGPA(List<Student> studList) {
		Comparator<Student> studComparator= Comparator.comparingDouble(Student::getGpa);
		studList.sort(studComparator);
		studList.forEach(studentConsumer);
	}
	
	public static void comparatorChaining(List<Student> studList) {
		Comparator<Student> studComparator= Comparator.comparing(Student::getName);
		Comparator<Student> gradeComparator= Comparator.comparing(Student::getGradeLevel);
		studList.sort(gradeComparator.thenComparing(studComparator));
		studList.forEach(studentConsumer);
	}
	
	public static void sortWithNullValues(List<Student> studList) {
		Comparator<Student> nameComparator= Comparator.comparing(Student::getName);
		Comparator<Student> nullComparator = Comparator.nullsFirst(nameComparator);
		studList.sort(nullComparator);
	}
	public static void main(String arg[]) {
		comparatorChaining(StudentData.getAllStudents());
		//sortByGPA(StudentData.getAllStudents());
		//sortByName(StudentData.getAllStudents());
		sortWithNullValues(StudentData.getAllStudents());
	}
}
