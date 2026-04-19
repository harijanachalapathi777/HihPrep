package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

	public static void main(String[] args) {
		
//		HashMap<String,Integer> map = new HashMap<>(Map.of("a", 1,
//				                             "b", 2,
//				                             "c", 3));
//		
//		System.out.println(map);
		
		
		HashSet<Character> set = new HashSet<>(Set.of('a','b','c','d'));
		
		System.out.println(set);

		
		/* here Map.of(); & Set.of() are the factory methods, as there is no implementation or logic
		 * for ex: if you take routing method in UCX it have some implementaion that is regular method.
		 * but factory methods dont have implementation ex; grtDriver() in driver factory */
		 
		 
		 List<String> browsers = List.of("chrome","firefox","safari","chrome");
		 System.out.println(browsers);
	}

	
}
