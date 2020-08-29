package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

	
	
	public static int kthSmallestElementInGivenArrayMaxHeap(int[] arr, int k) {
	    if(arr.length < k) {
	      System.out.println("Invalid Case");
	      return -1;
	    }
	    
	    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	    
	    for(int i = 0; i < k; i++) {
	      maxHeap.add(arr[i]);
	    }
	    
	    for(int i = k; i < arr.length; i++) {
	      if(arr[i] < maxHeap.peek()) {
	        maxHeap.poll();
	        maxHeap.add(arr[i]);
	      }  
	    }
	    
	    return maxHeap.peek();
	  }
	  
	  public static int kthSmallestElementInGivenArrayMinHeap(int[] arr, int k) {
	    if(arr.length < k) {
	      System.out.println("Invalid Case");
	      return -1;
	    }
	    
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    
	    for(int i = 0; i < arr.length; i++) {
	      minHeap.add(arr[i]);
	    }
	    
	    for(int i = 0; i < k - 1; i++) {
	      minHeap.poll();  
	    }
	    
	    return minHeap.peek();
	  }
	public static void main(String[] args) {
		int[] nums= {3,2,3,1,2,4,5,5,6};
		System.out.println(kthSmallestElementInGivenArrayMaxHeap(nums,2));
		System.out.println(kthSmallestElementInGivenArrayMinHeap(nums,2));
	}
}
