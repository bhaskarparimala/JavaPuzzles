package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ListOfMissingPostiveNumbers {
	public static List<Integer> firstMissingNumber(int[] nums) {
		if(nums.length<=0)
			return new ArrayList<Integer>();
		int missing_num=0;
		int pos=0;
		int temp=0;
		List<Integer> missing_nums_list = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0 && nums[i]<nums.length && nums[i]!=i+1) {
				
				temp=nums[nums[i]-1];
				nums[nums[i]-1]=nums[i];
				nums[i]=temp;
				
			}
			
		}
		for(int i: nums)
		System.out.println("present array: "+ i);
		for(int i=0;i<nums.length;i++)
		{
		if(nums[i]!=i+1)
			{
			missing_nums_list.add(i+1);
			
			}
		
		}
		return missing_nums_list;
		
		
	}
	public static void main(String[] arg) {
		int[] nums= {-1,-3,1,2,4,8};
		System.out.println("Missing nums : "+firstMissingNumber(nums));
	}
}

