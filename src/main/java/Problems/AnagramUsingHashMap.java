package Problems;

import java.util.HashMap;

public class AnagramUsingHashMap {
	
	public static boolean anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) return false;
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : s1.toCharArray()) { // this will be like char c : array (& c will hold character of an array)
			if(hm.containsKey(c)) {	
				int var = hm.get(c);
				hm.put(c, var + 1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(char c : s2.toCharArray()) {
			if(! hm.containsKey(c)) return false;
				int var = hm.get(c);
				hm.put(c, var -1);
				
				if(hm.get(c) == 0) hm.remove(c);
					
		}
		return hm.isEmpty();
	}

	public static void main(String[] args) {
		
		String s1 = "SILENT";
		String s2 = "LISTEN";
		
       anagram(s1,s2);
       System.out.println(anagram(s1,s2));
	}

}
