package Java8.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Java8.Student;
import Java8.StudentData;
public class StreamLimitSkipExample {

	public static Optional<Integer> limitSumNumbers(List<Integer> numList){
		return numList.stream()
		.limit(4)//2,3,4,5
		.reduce((a,b)->a+b);
	}
	public static Optional<Integer> skipSumNumbers(List<Integer> numList){
		return numList.stream()
		.skip(3)//5,6,7
		.reduce((a,b)->a+b);
	}
	public static void main(String arg[]) {
		List<Integer> numList = Arrays.asList(2,3,4,5,6,7);
		Optional<Integer> sumNums=limitSumNumbers(numList);
		if(sumNums.isPresent()) {
			System.out.println("Sum is "+sumNums.get());
		}else {
			System.out.println("Sum is "+0);
		}
	
	
	Optional<Integer> sumNums2=skipSumNumbers(numList);
	
	if(sumNums2.isPresent()) {
		System.out.println("Sum is "+sumNums2.get());
	}else {
		System.out.println("Sum is "+0);
	}
	}
}
