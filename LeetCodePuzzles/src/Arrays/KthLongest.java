package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Solution - 1: using Min heap
- Create min heap of k size
- Now keep adding other element 
- If current value is less than peek value, then we need not do anything
- If current value is greater than peek value, we poll top value & insert current value
- At last after iteration of all value, the peek of minHeap will be 3rd Largest

Solution - 2: using Max heap
- Create max heap & insert all value into it
- Now poll k - 1 values from it
- Now the peek value at the moment will be 3rd largest value
 * @author bparimal
 *
 */
public class KthLongest {

	public static int kthLongestUsingMinHeap(int[] nums,int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		//first create a heap of size k
		for(int i=0;i<k;i++)
			minHeap.add(nums[i]);
		for(int i=k;i<nums.length;i++) {
			//if root is less than the current element then delete the root and insert the new element.
			if(!minHeap.contains(nums[i])&&nums[i]>minHeap.peek())
				{
					minHeap.poll();
					minHeap.add(nums[i]);
				}
		}
		
		return minHeap.peek();
	}
	
	public static int kthLongestUsingMaxHeap(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<nums.length;i++)
			maxHeap.add(nums[i]);
		for(int i=0;i<k-1;i++)
			maxHeap.poll();
		return maxHeap.poll();
	}
	
	public static void main(String[] args) {
		//int[] nums= {3,2,3,1,2,4,5,5,6,6};
		int[] nums= {3,2,3,1,2,4,5,5};
		System.out.println("using MaxHeap : "+kthLongestUsingMinHeap(nums,2));
		System.out.println("using MaxHeap : "+kthLongestUsingMaxHeap(nums,2));
	}
}
