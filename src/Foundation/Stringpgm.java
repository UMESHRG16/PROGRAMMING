package Foundation;

public class Stringpgm {
	public static void main(String[] args) {
		String str = "hello world";
		int ch=str.length();
			for (int i = 0; i < ch; i++) {
			char ch1=str.charAt(i);
			System.out.print(ch1 +" ");
		}
	}
}
