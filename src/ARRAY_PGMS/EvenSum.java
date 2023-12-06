package ARRAY_PGMS;

public class EvenSum {
	public static void main(String[] args) {
		int[] arr = { 10, 27, 39, 49, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
			sum = sum + arr[i];
		}
		}
		System.out.println(sum);
	}

}
