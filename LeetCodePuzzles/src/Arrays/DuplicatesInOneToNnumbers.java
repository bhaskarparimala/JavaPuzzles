package Arrays;

import java.util.HashMap;

/**
 * {2,3,4,2,1}
 * n=4
 * duplicate number is 2
 * @author bparimal
 *
 */
public class DuplicatesInOneToNnumbers {

	public static void main(String args[]) {
		int[] a= {4,3,4,5,1};
		int temp=0;
		int i=0;
		while(i<a.length) {
			if(a[i]!= a[a[i]-1]) {
				int index=a[i]-1;
				temp=a[i];
				a[i]=a[index];
				a[index]=temp;
						
			} else {
				i++;
			}
		}
//		for(int j:a)
//		System.out.print(j);
		
		HashMap<Integer,Integer> sampleMap = new HashMap<Integer,Integer>();
		System.out.println( 1 << 30);
		sampleMap.put(1,1);
	}
}
