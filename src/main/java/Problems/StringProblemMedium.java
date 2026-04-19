package Problems;

public class StringProblemMedium {

	public static void main(String[] args) {
		String s = "I1am2an0SDET4";
		char chr[] = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		int index=0;
		
		for(int i=0;i<chr.length;i++) {
			int num = 0;
			if(Character.isDigit(chr[i])) {
				//num = chr[i]-'0';
				num = Character.getNumericValue(chr[i]);
				
				for(int j=0;j<num;j++) {
					System.out.println(sb);
				}
				index++;
				sb.setLength(0);
					
				
			}
			else {
				sb.append(chr[i]);
			}
		}
		

	}

}
