package ARRAYS;

public class MISSINGNUMBER {
	
	
	static int sumOfNnumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	static int sumOfElements(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 9;
		int[] arr = { 1, 4, 5, 3, 7, 8, 6,9 };

		int sumOfNnumbers = sumOfNnumbers(n);
		int sumOfElements = sumOfElements(arr);
		int missingNumber = sumOfNnumbers - sumOfElements;

		System.out.println("Missing Number is = " + missingNumber);
	}
}
