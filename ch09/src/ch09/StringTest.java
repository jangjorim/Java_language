package ch09;

public class StringTest {

	static void show(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {

		show(new String("맨붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
	}
}
