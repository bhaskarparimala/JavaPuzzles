package Arrays;

/**
 * Find Equilibrium point where elements before & after it has equal sum
 * a={1,6,7,0,7} then before index 2 sum is 7 and after sum is 7
 * so anwer is Index 2.
 * @author bparimal
 *
 */
public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] nums= {7,1,7};
		System.out.println("Answer: "+findEquilibriumPoint(nums));
	}
	
	public static int findEquilibriumPoint(int[] nums) {
		int pos=-1;
		if(nums.length<=0)
			return -1;
		int sum=0,sum_so_far=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			sum=sum-nums[i];
			if(sum==sum_so_far)
				return i;
			else
				sum_so_far=sum_so_far+nums[i];
		}
		return -1;
	}
}
