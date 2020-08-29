package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfUnSortedArrays {
	public static void main(String[] args) {
		int[] arr1= {2, 2, 3, 4, 4, 4, 7, 8};
		int[] arr2= {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
		
		printUnionOfUnSortedArrays(arr1,arr2);
	}
	
	public static void printUnionOfUnSortedArrays(int[] arr1,int[] arr2) {
		Set<Integer> resultSet = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
			resultSet.add(arr1[i]);
		for(int i=0;i<arr1.length;i++)
			resultSet.add(arr2[i]);
		
		System.out.println(resultSet);
	}
}
