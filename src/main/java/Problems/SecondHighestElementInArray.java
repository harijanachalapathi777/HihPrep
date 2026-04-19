package Problems;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
		int arr[] = {9,6,8,3,3,0,67,8,4,87,90,38,65,90,89,78};
		//int N = arr.length;
		/* Using sort method*/
		Arrays.sort(arr); // assending order
		
		int highest = arr[arr.length-1];
		int sec_highest = 0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<highest) {
				sec_highest = arr[i];
				break;
			}
		}
		System.out.println(highest);
		System.out.println(sec_highest);
		          //int sec_highest = arr[N-3];
		          //System.out.println(sec_highest);
	}

}
