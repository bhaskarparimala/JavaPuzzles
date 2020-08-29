package Arrays;
/**
 *  Find 1st occurrence of a value in array if adjacent values differ by 1
 *  1)find the absolute value of index value with given value
 *  2)jump to the step 1 caluculated positions
 *  3)if value is equal to the given value return postion
 *  4)else re caluculate step1 value.
 * @author bparimal
 *
 */
public class Find1stoccurrenceOfValueInArrayIfAdjacentValuesDifferBy1 {

	public static void main(String[] args) {
		int arr1[] = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
	    int arr2[] = {2, 3, 2, 4, 5, 6, 7};
	    System.out.println(findFirstOccurrenceIfAdjecentValueDifferBy1(arr1, 2));
	    System.out.println(findFirstOccurrenceIfAdjecentValueDifferBy1(arr2, 2));
		
	}
	
	public static int findFirstOccurrenceIfAdjecentValueDifferBy1(int[] nums,int val) {
		int result=-1;
		if(nums.length<=0)
			return -1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==val)
				result= i;
			else {
				i=i+Math.abs(nums[i]-val)-1;
			}
		}
		return result;
	}
}
