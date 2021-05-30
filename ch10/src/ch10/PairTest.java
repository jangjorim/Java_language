package ch10;

class Pair<T> {
	T a;
	T b;

	Pair() {

	}

	Pair(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public T first() {
		return a;
	}

	public T second() {
		return b;
	}
}

public class PairTest {
	public static void main(String[] args) {
		Pair<Integer> p1 = new Pair<>(10, 20);
		Pair<Double> p2 = new Pair<>(10.0, 20.0);

		System.out.println(p1.first());
		System.out.println(p2.second());

	}
}
