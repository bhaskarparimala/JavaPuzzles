package Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
	public static void main(String[] arg) {
		int[] arr1= {2, 2, 3, 4, 4, 4, 7, 8};
		int[] arr2= {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
		
		interSectinOfArrays(arr1,arr2);
	}
	
	public static void interSectinOfArrays(int[] arr1,int[] arr2) {
		int i=0,j=0;
		List<Integer> result = new ArrayList<Integer>();
		while(i<arr1.length && j<arr2.length) {
			while((i < arr1.length - 1) && arr1[i]==arr1[i+1])
				i++;
			while((j < arr2.length - 1) && arr2[j]==arr2[j+1])
				j++;
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}
			else {
				result.add(arr1[i]);
			 i++;
			 j++;
			 
			}
		}
		System.out.println("InterSectin is: "+result);
	}
}
