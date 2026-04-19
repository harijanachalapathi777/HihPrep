package Problems;

import java.util.HashSet;

public class PrintLongestSubstringInString {

	public static void main(String[] args) {
     String s = "abcabcbb";
     
     if(s.length()==0) System.out.println("empty");
     if(s.length()==1) System.out.println("empty");

     int left = 0;
     int max = 0;
     int start_index =0;
     
     HashSet<Character> set = new HashSet<>();
     
     for(int right=0;right<s.length();right++) {
    	 while(set.contains(s.charAt(right))) {
    		 set.remove(s.charAt(left));
    		 left++;
    	 }
    	 set.add(s.charAt(right));
    	 if(right-left+1>max) {
    		 max=right-left+1;
    		 start_index=left;
    	 }    	 
     }
     System.out.println(max);
     String longestSubstring = s.substring(start_index, start_index+max);
     System.out.println(longestSubstring);
	}
}
