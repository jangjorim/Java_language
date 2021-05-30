package ch05;

public class Test0001 {

	static int a;

	static void countchar(String s, char c) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				a++;
			}
		}
		System.out.println(a);
	}

	public static void main(String[] args) {

		countchar("Hello", 'H');

	}
}
