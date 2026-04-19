package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTargetNumUsingHashMap {
	
	
	// to find all possible combinations
	
	public static List<int[]> twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		List<int[]> results = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			int diff = target - arr[i];
			if(hm.containsKey(diff)) {
				results.add(new int[] {hm.get(diff),i});
			}
				hm.put(arr[i], i); 
		}
		return results;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,7,1,9};
		int target = 9;
		
		List<int[]> res = twoSum(arr,target); 
		twoSum(arr,target);
		for(int[] pair : res) {
		//System.out.println(pair[0] + " " + pair[1]);
		System.out.println(Arrays.toString(pair));	
		   }
		} 
	
	
	
	
	//to find single combination
	
//	public static int[] twoSum(int[] arr, int target) {
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			int diff = target - arr[i];
//			if(hm.containsKey(diff)) {
//				return new int[] {hm.get(diff),i}; // result.add (new int[] {})
//			}
//				hm.put(arr[i], i); 
//		}
//		//throw new IllegalArgumentException("No solution found");
//		System.out.println("no solution founddd");
//		return null;
//	}

//	public static void main(String[] args) {
//		
//		int[] arr = {2,7,11,15,8,9,3};
//		int target = 9;
//		
//		int res[] = twoSum(arr,target); // list<int[]> res =  
//		twoSum(arr,target);
//		System.out.println(res[0] + " " + res[1]);
//		}
	}
