package ch10;

class Max<S, U extends Number> {
	public Number max(S s, U u) {
		Number n1 = (Number) s;
		Number n2 = (Number) u;

	}
}

public class NewMaxTest {
	public static void main(String[] args) {
		Max m = new Max();
		System.out.println(m.max(10.0, 8.0));
		System.out.println(m.max(5, 8.0));
		System.out.println(m.max(5, 3.0));
	}
}
