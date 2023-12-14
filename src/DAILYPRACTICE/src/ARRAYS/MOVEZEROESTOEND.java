package ARRAYS;

import java.util.Arrays;

public class MOVEZEROESTOEND {
	static void moveZerosToEnd(int arr[]) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {//0,1,2,3,4,5,
			if (arr[i] != 0) {
				arr[count] = arr[i];//0=12,1=7,2=8,3=3
				count++;//1,2,3,4
			}
		}

		while (count < arr.length) {//4<7
			arr[count] = 0;//arr[4]==0,arr[5]==0,arr[6]==0
			count++;//5,6
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]=new int[] { 12, 0, 7, 0, 8, 0, 3 };
		moveZerosToEnd(arr);
	}
}
