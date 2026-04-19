package Problems;

import java.util.Arrays;
import java.util.List;

public class SplitStringUsingRegex {

	// remove spaces and start so, o/p should be "AANNAN"
	public static void main(String[] args) {
//		String s = "A 1..3AN*.N 8.A*N";
//		
//		String[] str = s.split(" "); // use this if you want to split with one character
//		String[] str2 = s.split("[. *]"); // use this if you want to split with pattern or one or more letters/chars[this line is especially for regex]
//		
//		for(String str1 : str) {
//			System.out.print(str1);
//		}
		
		List a = Arrays.asList(1,"name", 1.59, 56789, "@#$%^", true, false);

		for(Object str : a) {
			System.out.println(str);
		}
	}

}
