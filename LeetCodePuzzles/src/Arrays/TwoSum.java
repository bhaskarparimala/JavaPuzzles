package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * @author bparimal
 *
 */
public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> result = new HashMap<Integer,Integer>();
         int diff=0;
         for(int i=0;i<nums.length;i++) {
        	diff=target-nums[i];
        	if(result.containsKey(diff)) {
        		return new int[] {result.get(diff),i};
        	}
        	result.put(nums[i], i);
         }
	  return new int[0];
}//method
	 public static void main(String arg[]) {
		 TwoSum obj = new TwoSum();
		 int[] input= {3,2,4};
		 int target=6;
		 int[] output=obj.twoSum(input, target);
		 for(int i=0;i<output.length;i++) {
			 System.out.println(output[i]);
		 }
	 }
}
