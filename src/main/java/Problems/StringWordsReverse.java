package Problems;

public class StringWordsReverse {

	public static void main(String[] args) {
		String s = "I am an                  SDET";

		StringBuilder sb = new StringBuilder(); // to make strings mutable
		//convert string to string array
		String[] str = s.split("\\s+");
		
		//loop over string of words and do reverse
		for(String word : str) {
			char[] chr = word.toCharArray();
			int left = 0;
			int right = chr.length-1;
			while(left < right) {
				char temp = chr[left];
				chr[left] = chr[right];
				chr[right] = temp;
				left ++;
				right --;	
			}
			sb.append(new String(chr)).append(" ");
		}
		System.out.println(sb);
	}

}
