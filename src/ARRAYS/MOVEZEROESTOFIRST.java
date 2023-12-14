package ARRAYS;

import java.util.Arrays;

public class MOVEZEROESTOFIRST {

	static void moveZerosToFront(int arr[]) {
		int counter = arr.length - 1;//7-1=6

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter--;
			}
		}

		while (counter >= 0) {
			arr[counter] = 0;
			counter--;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 0, 7, 0, 8, 0, 3 };
		moveZerosToFront(arr);
	}
}
