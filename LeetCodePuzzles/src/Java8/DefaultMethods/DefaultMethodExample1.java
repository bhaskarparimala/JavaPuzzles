package Java8.DefaultMethods;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample1 {

	public static void main(String arg[]) {
		List<String> namesList = Arrays.asList("Bhaskar","Rajani","Ikswhak","Advay");
		
		/*
		 * Prior Java 8
		 */
	//	Collections.sort(namesList);
	//	System.out.println("Sorting using Collections sort: "+namesList);
		
		/*
		 * In Java 8
		 */
		namesList.sort(Comparator.naturalOrder());
		System.out.println("Sorting using List Sort natural Order: "+namesList);
		namesList.sort(Comparator.reverseOrder());
		System.out.println("Sorting using List Sort Reverse Order: "+namesList);
	}
}
