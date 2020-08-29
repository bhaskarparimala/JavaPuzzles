package Arrays;
/**
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * @author bparimal
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		int[] nums= {1,-2,3,4,5,6};
		int j=nums.length-1,temp=0;
		for(int i=0;i<(nums.length/2);i++) {
			temp=nums[j];
			nums[j]=nums[i];
			nums[i]=temp;
			j--;
		}
		for(int i:nums)
		System.out.print(" "+i);
	}
}
