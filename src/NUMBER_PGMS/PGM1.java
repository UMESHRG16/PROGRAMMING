package NUMBER_PGMS;

//Fetch number

public class PGM1 {
 public static void main(String[] args) {
	int n=12345;
	while (n!=0) {
		int rem=n%10;
		System.out.println(rem);
		n=n/10;
	}
	
}
}
