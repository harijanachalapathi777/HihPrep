package Problems;

public class MissingNumInArray {
	
	public static void missingNumInAnArray(int[] arr) {
		//sum of N formula to get sum of elements in an array
		int n = arr.length;
		int expectedNum = n+1;
		int sumFormula = (expectedNum*(expectedNum+1))/2;
		int sumOfGivenArray = 0;
		for(int i=0;i<n;i++) {
			sumOfGivenArray = sumOfGivenArray + arr[i];
		}
		int missingNum = sumFormula - sumOfGivenArray;
		
		System.out.println(missingNum);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,8};
		missingNumInAnArray(arr);

	}

}
