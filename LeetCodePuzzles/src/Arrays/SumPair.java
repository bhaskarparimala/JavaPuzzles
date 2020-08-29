package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class SumPair {

	public static void printSubArray(int[] num,int sum) {
		Map<Integer,Integer> numsMap = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++)
			numsMap.put(num[i],num[i]);
		int temp=0;
		int[] result=new int[2];
		for(int i=0;i<num.length;i++) {
			temp=sum-num[i];
			if(numsMap.containsKey(temp))
				{
				result[0]=num[i];
				result[1]=temp;
				break;
				}
		}
		System.out.println("The result: "+result[0] +" "+result[1]);
	}
	public static void main(String[] arg) {
		int[] nums= {0, -1, 2, -3, 1};
		printSubArray(nums,-2);
	}
	
}
