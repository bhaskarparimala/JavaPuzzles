package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 lessthan k lessthanequal number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.
 * @author bparimal
 *
 */
public class TopKFrequentElement {

	 public static int[] topKFrequent(int[] nums, int k) {
		 PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
	     Map<Integer,Integer> numsMap = new LinkedHashMap<Integer,Integer>();
	     int val=0;
	    
		 for(int i:nums) {
	        	if(numsMap.containsKey(i))
	        	{
	        		 val=numsMap.get(i);
	        		numsMap.put(i, ++val);
	        	}
	        	else
	        		numsMap.put(i, 1);
	        }
		 
		 for(Map.Entry<Integer, Integer> entry: numsMap.entrySet()) {
	            pq.offer(entry);
	            if(pq.size() > k) pq.poll();
	        }
	        int[] res = new int[k];
	        int index = 0;
	        while(pq.size() > 0) {
	            res[index++] = pq.poll().getKey();
	        }
	        
	        return res;
	    }
	 
	 public static void main(String[] args) {
		// int[] nums= {1,1,1,2,2,3};
		 int[] nums= {5,4};
		int[] result=topKFrequent(nums,1);
		for(int i: result)
			System.out.println(i);
	 }
}
