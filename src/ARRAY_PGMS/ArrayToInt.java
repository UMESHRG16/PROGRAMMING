package ARRAY_PGMS;

public class ArrayToInt {
public static void main(String[] args) {
	int[] arr= {10,2,5,67,7};
	String str="";
	for (int i = 0; i < arr.length; i++) {
		str=str+arr[i];
		int n=Integer.parseInt(str);
		System.out.println(n +" ");

	}
}
}
