package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LargestSumContinuousSubArray {

	
	
	public static void main(String[] args) {
		int[] nums= {-3,-4,4,-1,-2,1,5,-3};
		
		System.out.println("Max Sum: "+findMaxSumOfContinuousSubArray(nums));
		System.out.println("positions: "+PosOfMaxSumOfContinuousSubArray(nums));
	}
		public static int findMaxSumOfContinuousSubArray(int[] nums) {
		
		int current_max_sum=nums[0];
		int max_sum=nums[0];
		for(int i=1;i<nums.length;i++) {
			current_max_sum=Math.max(current_max_sum,current_max_sum+nums[i]);
			max_sum=Math.max(current_max_sum, max_sum);
		}
		
		return max_sum;
		
	}
	
		public static List<Integer> PosOfMaxSumOfContinuousSubArray(int[] nums) {
			int current_max_sum=nums[0];
			int max_sum=nums[0];
			int start=0,s=0,end=0;
			for(int i=1;i<nums.length;i++) {
				if(nums[i]>current_max_sum+nums[i] ) {
					current_max_sum=nums[i] ;
					s=i;
				}else {
					current_max_sum=current_max_sum+nums[i] ;
				}
				if(current_max_sum > max_sum) {
					max_sum=current_max_sum;
					start=s;
					end=i;
				}
			}
			System.out.println("maxxxx sum: "+max_sum);
			List<Integer> positions= new ArrayList<Integer>();
			positions.add(start);
			positions.add(end);
			return positions;
		}
}
