package Problems;

import java.util.Arrays;

public class AnagramString {

	   public static boolean anagram(String s1, String s2) {
			
			if(s1.length() != s2.length()) return false;
			
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		}
	   
	   public static void main(String[] args) {
			String s1 = "SILENT";
			String s2 = "LISTEN";
			
			
			System.out.println(anagram(s1,s2));

	    }

}
