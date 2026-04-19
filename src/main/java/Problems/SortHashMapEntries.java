package Problems;

import java.util.*;

public class SortHashMapEntries {
/*given student & marks , put them in hashmap and sort
 * input: student1 = 70
 *        student1 = 60
 *        student1 = 80
 *        student1 = 50
 *        student1 = 90*/
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("student 1", 70);
		hm.put("student 2", 60);
		hm.put("student 3", 80);
		hm.put("student 4", 50);
		hm.put("student 5", 90);
		
		//coverting map to list
		
		/* method 1
        List<Integer> li = new ArrayList<>(hm.values());
        Collections.sort(li,Comparator.reverseOrder());
        System.out.println(li);
		*/
		
		
		List<Map.Entry<String,Integer>> list = new ArrayList<>(hm.entrySet());
		list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));       
		for(Map.Entry<String,Integer> entry : list) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}
