package Problems;

public class SecLargestNumInArray {
	
	
	public static void secLargNumInArray(int[] arr) {
		int largestNum = Integer.MIN_VALUE;
		int secLarNum = Integer.MIN_VALUE;
		
		for(int n : arr) {
			if(n > largestNum) {
				secLarNum = largestNum;
				largestNum = n;
			}
			else if(n > secLarNum && n < largestNum ) {
				secLarNum = n;
			}
		}
		System.out.println(secLarNum);
	}

	public static void main(String[] args) {
		
    int arr[] = {0,8,7,1,6,2,5,9,11,11,45,45,12,};
    secLargNumInArray(arr);
	}

}
