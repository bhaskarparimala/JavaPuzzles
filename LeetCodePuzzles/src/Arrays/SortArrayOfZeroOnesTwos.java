package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayOfZeroOnesTwos {

	public static void main(String[] args) {
	int[] nums= {5,4,4,5,3,3,1,0,3,6};
	//sortArrayOfAnyDuplicateNumbers(nums);
	
	int[] nums2= {2,0,2,1,1,0};
	sortArrayOfZeroOnesTwos(nums2);
	System.out.println("");
	sortArrayOfZeroOnesTwos(nums2);
	System.out.println("");
	sortZeroOnesTwosAproach3(nums2);
	}
	
	/**
	 * if the input array is with 0,1,2 with duplicates
	 */
	public static void sortArrayOfZeroOnesTwos(int[] nums) {
		int i=0;int j=i+1;
		int temp=-1;
		while(i<nums.length-1) {
			if(nums[i]<=nums[j]) {
				i++; j++;
			}else {
				temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				i=i>0?--i:0;
				j=i+1;
				
			}
		}
			for(int k=0;k<nums.length;k++)
				System.out.print(nums[k]);
				
		}
	
	/**
	 * it will sort with any input of numbers which have duplicates
	 * but its o(n2) time complex.
	 * @param nums
	 */
	public static void sortArrayOfAnyDuplicateNumbers(int[] nums){
	
	Map<Integer,Integer> inputMap = new HashMap<Integer, Integer>();
	
	PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getKey()-b.getKey());
	for(int i=0;i<nums.length;i++) {
		if(inputMap.containsKey(nums[i]))
		inputMap.put(nums[i],inputMap.get(nums[i])+1);
		else
			inputMap.put(nums[i],1);
	}
	
	for(Map.Entry<Integer,Integer> valuesMap: inputMap.entrySet()) {
		pq.add(valuesMap);
	}
	int j=0;
	int key=0;
	int value=0;
		while(!pq.isEmpty()) {
			key=pq.peek().getKey();
			value=pq.peek().getValue();
			while(value>0)
			{
				nums[j]=key;
				j++;
				value--;
			}	
			pq.poll();
		}
		
	for(int i=0;i<nums.length;i++)
		System.out.print(nums[i]);
	}	
	
	/**
	 * one pass solution
	 */
	
	public static void SortZeroOneTwos(int[] nums) {
		 int start = 0;
	        int index = 0;
	        int end = nums.length-1;
	        while(start < end && index <= end){
	            if (nums[index] == 0){
	                nums[index] = nums[start];
	                nums[start] = 0;
	                start ++;
	                index ++;
	            }
	            else if (nums[index] == 2){
	                nums[index] = nums[end];
	                nums[end] = 2;
	                end --;
	            }
	            else {
	                index ++;
	            }
	        }
	        for(int i=0;i<nums.length;i++)
	    		System.out.print(nums[i]);
	    		
	    	
	}
	/**
	 * with 2 passes
	 * @param nums
	 */
	public static void sortZeroOnesTwosAproach3(int[] nums) {
		int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0)
                count0 += 1;
            else if (nums[i] == 1)
                count1 += 1;
            else if (nums[i] == 2)
                count2 += 1;
        }   
        int zeroOneCount = count0 + count1;
        for (int i=0; i<count0; i++)
            nums[i] = 0;
        for (int i=count0; i<zeroOneCount; i++)
            nums[i] = 1;
        for (int i=zeroOneCount; i<nums.length; i++)
            nums[i] = 2;
        for(int i=0;i<nums.length;i++)
    		System.out.print(nums[i]);
    	
	}
		
	
}

