package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {12,34,45,65,83};
		
		int index=binarySearch(a,83,0,a.length-1);
		System.out.println("position is: "+index);
		System.out.println("added to git");
	}
	
	public static int binarySearch(int[] nums,int find,int start , int end) {
		if (nums.length == 0 || start > end)
			return -1;
		int currPos = (start + end) / 2;
		if (find == nums[currPos])
			return currPos;
		if (find < nums[currPos])
			return binarySearch(nums, find, start, currPos);
		else
			return binarySearch(nums, find, currPos + 1, end);

	}
}
