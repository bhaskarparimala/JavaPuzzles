package Arrays;

import java.util.HashSet;
import java.util.Set;

public class MultiplicationMatchesTwoArrayValues {

	public static void main(String[] args) {
		int[] arr= {2,4,2,3,10,7,5,8};
		int multiVal=4;
		Set<Integer> valueSet = new HashSet<Integer>();
		int i=0;
		boolean found =false;
		int[] result = new int[2];
		while(i<arr.length) {
			if(multiVal%arr[i]==0 && valueSet.contains(multiVal/arr[i])) {
				found=true;
				result[0]=multiVal/arr[i];
				result[1]=arr[i];
				break;
			}
			valueSet.add(arr[i]);
				i++;
		}
		if(found)
			for(int j: result)
				System.out.println(j);
	}
}
