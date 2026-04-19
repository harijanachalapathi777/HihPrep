package Problems;

public class HowMnayAnagramsInAString {
	
	
	
	public static int anagramsInAString(String[] str) {
		int count =0;
		
		for(int i=0;i<str.length;i++) {
			String word = str[i];
			int start=0;
			int end=word.length()-1;
			if(word.length() > 1) {
			while(end > start) {
				if(word.charAt(start) != word.charAt(end)){
				   continue;
				}
				
				if(word.charAt(start)== word.charAt(end)) {
				start++;
				end--;
				}	
			}
		}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
				
		String s = "  aa  aa     odg dog   gdo ";
		
		String str[] = s.trim().split("\\s+");
		System.out.println(anagramsInAString(str));

	}

}
