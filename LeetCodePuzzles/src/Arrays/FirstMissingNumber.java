package Arrays;

public class FirstMissingNumber {

	public static int firstMissingNumber(int[] nums) {
		if(nums.length<=0)
			return -1;
		int missing_num=0;
		int pos=0;
		int temp=0;
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
			missing_num=i+1;
			break;
			}
		
		}
		return missing_num;
		
		
	}
	
	public static void main(String[] arg) {
		int[] nums= {-1,-3,1,2,4,8};
		System.out.println("Missing nums : "+firstMissingNumber(nums));
	}
}
