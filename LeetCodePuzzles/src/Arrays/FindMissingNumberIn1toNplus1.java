package Arrays;

public class FindMissingNumberIn1toNplus1 {
	
	public static void main(String[] args) {
		int[] nums= {2,4,1,5,6};
		int i=0;
		int index=0;
		while(i<nums.length) {
			if(nums[i]!=i+1 && nums[i]<=nums.length) {
				index=nums[i]-1;
				int temp=nums[i];
				nums[i]=nums[index];
				nums[index]=temp;
			}
			else
				i++;
		}
		
		for(int j=0;j<nums.length;j++)
			
			if(nums[j]!=j+1) {
				System.out.println("missing number: "+(j+1));
			break;
			}
		
	}
	
	/*
	 * 2nd approach use 
	 * sum of n integers in the range 1 to n is 
	 * avg= n*(n+1)/2
	 * missing number is avg=(1+2+3+4+...n)
	 *  
	 */

}
