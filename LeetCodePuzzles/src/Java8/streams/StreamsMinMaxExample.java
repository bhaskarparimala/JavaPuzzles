package Java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	private static int findMaxNumber(List<Integer> numList) {
		return numList.stream()
			.reduce(0, (a,b)->a>b?a:b);
	}
	
	private static Optional<Integer> findMaxNumberOptional(List<Integer> numList) {
		return numList.stream()
			.reduce( (a,b)->a>b?a:b);
	}
	
	private static Optional<Integer> findMinNumberOptional(List<Integer> numList) {
		return numList.stream()
			.reduce((a,b)->a<b?a:b);
	}
	public static void main(String arg[]) {
		List<Integer> numList = Arrays.asList(3,9,5,10,34,21);
		List<Integer> numList2 = new ArrayList<Integer>();
		System.out.println("The Max Number is: "+findMaxNumber(numList));
		//if we pass empty arraylist it will return zero..
		//this is wrong , it should return empty value. to avoid this we will use
		//Optional
		System.out.println("The Max Number is: "+findMaxNumber(numList2));
		//Optional<Integer> maxValue=findMaxNumberOptional(numList);
		Optional<Integer> maxValue=findMaxNumberOptional(numList2);
		if(maxValue.isPresent()) {
			System.out.println("MaxValue is: "+maxValue.get());
		}else {
			System.out.println("no max value present");
		}
		
		Optional<Integer> minValue=findMinNumberOptional(numList);
		if(minValue.isPresent()) {
			System.out.println("minValue is: "+minValue.get());
		}else {
			System.out.println("no min value present");
		}
		
		
		
	}
}
