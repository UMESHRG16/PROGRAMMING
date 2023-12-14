package ARRAYS;

public class REMOVEDUPLICATES {

	public static void main(String[] args) {
        int[] arr = new int[] {111, 333, 555, 777, 333, 444, 555};
        REMOVEDUPLICATES(arr);
	}
	static void REMOVEDUPLICATES(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag=true;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
				flag=false;
				break;
				}
			}
			if(flag) {
				System.out.println(arr[i]);
			}
		}
	}
}
