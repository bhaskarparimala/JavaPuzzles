package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubArraySumEqualToGivenSum {

	public static void printSubArray(int[] arr,int sum) {
		if (arr.length == 0) {
		      System.out.println("Array is empty");
		      return;
		    }

		    int end, totalSumTillNow;
		    end = 0;
		    totalSumTillNow = 0;
		    
		    Map<Integer, Integer> map = new HashMap<>();

		    while (end < arr.length) {
		      totalSumTillNow = totalSumTillNow + arr[end];

		      if (totalSumTillNow == sum) {
		        System.out.println("Start Index: " + 0 + ", End Index: " + end);
		        return;
		      }
		      
		      int windowSum = totalSumTillNow - sum;
		      
		      if(map.containsKey(windowSum)) {
		        int start = map.get(windowSum);
		        System.out.println("Start Index: " + (start + 1) + ", End Index: " + end);
		        return;
		      } 
		      
		      map.put(totalSumTillNow, end++);
		    }
		  }
		
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,7,5};
		printSubArray(nums,12);
	}
}
