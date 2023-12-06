package NUMBER_PGMS;

public class SumEven {

	public static void main(String[] args) {
		int n = 12445;
		int sum = 0;
		
		while (n != 0) {
			int rem = n % 10;
			if (rem%2== 0) {
				sum=sum+rem;
			}
			n = n / 10;
		}
System.out.println(sum);
	}

}
