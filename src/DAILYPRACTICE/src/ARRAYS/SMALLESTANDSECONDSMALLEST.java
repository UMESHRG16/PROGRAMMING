package ARRAYS;

import java.util.Arrays;

public class SMALLESTANDSECONDSMALLEST {

	 static void getSmallestAndSecondSmallestElement(int[] arr) {
		int smallest = arr[0];

		int secondSmallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;

				smallest = arr[i];
			} else if (arr[i] > smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}

		System.out.println("Input Array : " + Arrays.toString(arr));

		System.out.println("Smallest Element : " + smallest);

		System.out.println("Second Smallest Element : " + secondSmallest);
	}

	public static void main(String[] args) {
		getSmallestAndSecondSmallestElement(new int[] { 17, 11, 23, 64, 41, 88, 35 });
	}
}