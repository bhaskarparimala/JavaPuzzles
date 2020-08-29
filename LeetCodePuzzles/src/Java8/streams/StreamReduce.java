package Java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	public static int performMultiplication(List<Integer> numList) {
		//1 is the initial value
		//a=1 , b is from stream i.e. 1*2=2
		//a=2 from result of above , b<from stream> 2*5=10
		//a=10 , b=7 -->70
		return numList.stream().reduce(1, (a,b)->a*b);
		
	}
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numList) {
		
		return numList.stream().reduce((a,b)->a*b);
		
	}
	public static void main(String arg[]) {
		List<Integer> numList = Arrays.asList(2,5,7);
		System.out.println("Result1: "+performMultiplication(numList));
		
		List<Integer> numList2 = Arrays.asList(2,5,7);
		Optional<Integer> result2= performMultiplicationWithoutIdentity(numList2);
		System.out.println("is value present: "+result2.isPresent());
		System.out.println("Result2: "+result2.get());
		
		List<Integer> numList3 = new ArrayList();
		Optional<Integer> result3= performMultiplicationWithoutIdentity(numList3);
		System.out.println("is value present: "+result3.isPresent()); // false as there is no result value becoz empty list sent.
		System.out.println("Result3: "+result3.get()); // this will throw noSuchElement Exception as there are no elements
		
		
	}
}
