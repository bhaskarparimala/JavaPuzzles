package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.Optional;

public class StudentData {
	/**
     * Total of 6 students in the database.
     * @return
     */
	
	public static Supplier<Student> sutudentSupplier=()->{
		Bike bike = new Bike();
		bike.setModel("Yz150");
		bike.setName("Yamaha");
		return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11,Optional.ofNullable(bike));
				
	};
    public static List<Student> getAllStudents(){

    	
        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"),12);
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"),9);
        Student student4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"),8);
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"),7);
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"),15);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
