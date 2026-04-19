package Problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String s = "hackErRank";
		char chr[] = s.toLowerCase().toCharArray();
        LinkedHashMap<Character,Integer> lm = new LinkedHashMap<>();
        for(int i=0;i<chr.length;i++) {
        	if(lm.containsKey(chr[i])) {
        		int var = lm.get(chr[i]);
        		lm.put(chr[i],var+1);
        	}
        	else {
        		lm.put(chr[i],1);
        	}
        }
        
        for(Map.Entry<Character, Integer> entry : lm.entrySet()) {
        	if(entry.getValue()==1) {
            	System.out.println(entry.getValue() + " " + entry.getKey());
            	break;
        	}
        }
	}

}
