package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfUnSortedArrays {

	public static void main(String[] arg) {
		
		int[] arr1= {2, 2, 3, 4, 4, 4, 7, 8};
		int[] arr2= {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
		
		printInterSectionOfArrays(arr1,arr2);
	}
	
	public static void printInterSectionOfArrays(int[] arr1,int[] arr2) {
		Set<Integer> firstSet = new HashSet<Integer>();
		Set<Integer> finalSet = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
			firstSet.add(arr1[i]);
		for(int j=0;j<arr2.length;j++)
		{
			if(firstSet.contains(arr2[j]))
				finalSet.add(arr2[j]);
		}
		
		System.out.println("InterSection of Unsorted Arrays: "+finalSet);
	}
}
