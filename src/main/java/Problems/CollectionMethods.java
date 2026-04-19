package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class CollectionMethods {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(3,6,54,23,245,768,121,1);
		
		Collections.sort(li);
		System.out.println("sort : "+li);
		
		Collections.sort(li, Comparator.reverseOrder());
		System.out.println("reverse order : " + li);
		
		Collections.sort(li, Comparator.naturalOrder());
		System.out.println("natural order : " + li);
		
		int max_num = Collections.max(li);
		System.out.println("max number is : " + max_num);
		
		int min_num = Collections.min(li);
		System.out.println("min num is : " + min_num);
		
		
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		map.put('a',3);
		map.put('b',2);
		map.put('z',1);
		map.put('d',2);
		
		List<Integer> nums = new ArrayList<>(map.values());
		List<Character> chars = new ArrayList<>(map.keySet());
		
		Collections.sort(nums);
		System.out.println("numbers in a list are sorted :  " +nums);
		
		Collections.sort(chars);
		System.out.println("characters in a list are sorted :  " +chars);
	}

}
