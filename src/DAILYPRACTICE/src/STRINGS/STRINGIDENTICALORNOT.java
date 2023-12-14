package STRINGS;

public class STRINGIDENTICALORNOT {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		if (str1.equals(str2)) {
			System.out.println("The two strings are identical.");
		} else {
			System.out.println("The two strings are not identical.");
		}
	}
}
