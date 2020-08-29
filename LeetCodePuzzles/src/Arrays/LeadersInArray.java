package Arrays;
/**
 * Print Elements which are greater than all it's right elements
 * {14,15,8,9,5,2}
 * answer: 15,9,5,2
 * @author bparimal
 *
 */
public class LeadersInArray {

	public static void PrintLeadersInArray(int[] nums) {
		int max=-1;
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]>=max) {
				max=nums[i];
				System.out.print(" "+ nums[i]);
			}	
		}
	}
	public static void main(String[] arg) {
		int[] nums= {14,15,8,9,5,2};
		PrintLeadersInArray(nums);
	}
}
