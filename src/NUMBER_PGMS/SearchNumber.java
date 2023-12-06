package NUMBER_PGMS;

public class SearchNumber {
	public static void main(String[] args) {
		int n = 12445;
		int count = 0;
		
		while (n != 0) {
			int rem = n % 10;
			if (rem == 4) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);

	}
}
