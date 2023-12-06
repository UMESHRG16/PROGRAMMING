package NUMBER_PGMS;

public class CountEven {
public static void main(String[] args) {
	int n=16388432;
	int count=0;
	while (n != 0) {
		int rem = n % 10;
		if (rem%2== 0) {
			count++;
		}
		n = n / 10;
	}
System.out.println(count);

}
}
