package ch10;

class Max<S, U extends Number> {
	public Number max(S s, U u) {
		Number n1 = (Number) s;
		Number n2 = (Number) u;
		if (n1 instanceof Double) {
			if (n2 instanceof Double) {
				return Math.max(n1.doubleValue(), n2.doubleValue());
			}
			if (Math.max(n1.doubleValue(), n2.doubleValue()) == n1.doubleValue()) {
				return n1.doubleValue();
			}
			return n2.intValue();

		} else {
			if (n2 instanceof Double) {
				if (Math.max(n1.doubleValue(), n2.doubleValue()) == n2.doubleValue()) {
					return n2.doubleValue();
				}
				return n1.intValue();
			}
			return Math.max(n1.intValue(), n2.intValue());
		}
	}
}

public class MaxTest {
	public static void main(String[] args) {
		Max m = new Max();
		System.out.println(m.max(10.0, 8.0));
		System.out.println(m.max(5, 8.0));
		System.out.println(m.max(5, 3.0));
	}
}
