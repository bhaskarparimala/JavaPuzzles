package Arrays;

import java.util.Arrays;

public class MaxMultiplicationOfTwoNumbers {
	
	
	/**
	 * O(NlogN) complexity
	 */
	
public static int getMaxMultiplicationOfTwoNumbers2(int[] arr) {
	if(arr.length < 2) {
	      return -1;
	    }
	    
	    if(arr.length == 2) {
	      return arr[0] * arr[1];
	    }
	    Arrays.sort(arr); 
	    int minValMultiplication=arr[0]*arr[1];
	    int maxValMultiplication=arr[arr.length-1]*arr[arr.length-2];
	    return Math.max(maxValMultiplication, minValMultiplication);
}
	/**
	 * O(N) complexity
	 * @param arr
	 * @return
	 */
	
public static int getMaxMultiplicationOfTwoNumbers(int[] arr) {
	
	if(arr.length < 2) {
	      return -1;
	    }
	    
	    if(arr.length == 2) {
	      return arr[0] * arr[1];
	    }
	    
	    int smallest = arr[0] < arr[1] ? arr[0] : arr[1];
	    int secondSmallest = arr[0] > arr[1] ? arr[0] : arr[1];
	    
	    int greatest = arr[0] > arr[1] ? arr[0] : arr[1];
	    int secondGreatest = arr[0] < arr[1] ? arr[0] : arr[1];
	    
	    
	    for(int i = 2; i < arr.length; i++) {
	      
	      if(arr[i] < smallest) {
	        secondSmallest = smallest;
	        smallest = arr[i];
	      } else if(arr[i] < secondSmallest) {
	        secondSmallest = arr[i];
	      }
	      
	      if(arr[i] > greatest) {
	        secondGreatest = greatest;
	        greatest = arr[i];
	      } else if(arr[i] > secondGreatest) {
	        secondGreatest = arr[i];
	      }
	    }
	    
	    int firstTwoMultiplication = smallest * secondSmallest;
	    int lastTwoMultiplication = greatest * secondGreatest;
	    
	    return firstTwoMultiplication > lastTwoMultiplication ?  firstTwoMultiplication : lastTwoMultiplication;
	  }
	
	

public static void main(String[] args) {

    
    int arr[] = { -4, 2, 3, -10, 4, -15, 3, 6 };

    System.out.println(getMaxMultiplicationOfTwoNumbers2(arr));
  }
}
