package Problems;

import java.util.HashSet;

public class LongestSubStringNoDuplicateChars {

	public static void main(String[] args) {
		String s = "abcabcbb";
		
		if(s.length()==0) System.out.println("Given string is empty.."); 
		if(s.length()==1) System.out.println("Given string has one letter.."); 

		int left = 0;
		int max = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		for(int right=0;right<s.length();right++) {
           while(set.contains(s.charAt(right))) {
        	     set.remove(s.charAt(left));
        		 left++;
           }
           
           set.add(s.charAt(right));
           max = Math.max(max, right-left+1); 
		}
		
		System.out.println(max);
	}

}
