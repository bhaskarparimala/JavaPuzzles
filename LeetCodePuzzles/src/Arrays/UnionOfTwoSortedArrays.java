package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArrays {

	public static void main(String[] arg) {
		int[] arr1= {2, 2, 3, 4, 4, 4, 7, 8};
		int[] arr2= {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
		
		unionOfSortedArrays(arr1,arr2);
	}
	
	
	public static int[] unionOfSortedArrays(int[] arr1,int[] arr2) {
		if(arr1.length==0 && arr2.length==0)
			return new int[0];
		else if(arr1.length==0 && arr2.length>0)
		return arr2;
		else if(arr2.length==0 && arr1.length>0)
			return arr1;
		int minLength= arr1.length>arr2.length?arr2.length:arr1.length;
		boolean copy2Flag=false,copy1Flag=false;
		int i=0,j=0;
		Set<Integer> result = new LinkedHashSet<Integer>();
		
		while(minLength>0) {
			if(arr1[i]<=arr2[j]) {
				result.add(arr1[i]);
				i++;
			   if(arr1.length==i)
				   copy2Flag=true;
			}
			else {
				result.add(arr2[j]);
				j++;
				if(arr2.length==j)
					   copy1Flag=true;
			}
			--minLength;
		}
		if(copy1Flag)
			for(int k=i;k<arr1.length;k++)
				result.add(arr1[k]);
		else
			for(int k=j;k<arr2.length;k++)
				result.add(arr2[k]);
	
	System.out.println("Union array is: "+ result);
	int[] unionArray= new int[result.size()];
	int y=0;
	for(int val:result) {
		unionArray[y]=val;
		y++;
	}
		return unionArray;
	}		
}
