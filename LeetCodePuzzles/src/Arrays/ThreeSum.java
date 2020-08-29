package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 * @author bparimal
 *
 */
public class ThreeSum {
public List<List<Integer>> threeSum(int[] nums) {
	
	      List<List<Integer>> result = new ArrayList<List<Integer>>();
	        List<Integer> triplet = new ArrayList<Integer>();
	        Arrays.sort(nums);
	        Set<List<Integer>> triplets = new HashSet<List<Integer>>();
	        int j,k;
	        for(int i=0;i<nums.length;i++) {
	        	j=i+1;
	        	 	k=nums.length-1;
	        	 	while(j<k) {
	        	int sum= nums[i]+nums[j]+nums[k] ;
	                    if(sum==0){
	        		triplet = new ArrayList<Integer>();
	        		triplet.add(nums[i]);
	        		triplet.add(nums[j]);
	        		triplet.add(nums[k]);
	        		triplets.add(triplet);
	        	k--;
	        	} else{
	               if(sum>0) k--;
	                else j++;
	            }
	                    
	        	 	}
	        }
	        //if(!triplets.isEmpty())
	        for(List val:triplets)
	        	result.add(val);
	       System.out.println(result);
	        
	        return result;  
	    
    }

public static void main(String arg[]) {
	ThreeSum obj = new ThreeSum();
	int[] nums = {-1, 0, 1, 2, -1,-4};
	
	obj.threeSum(nums);
}
}
