package ch10;

class Box<T> {

	T a;

	Box() {

	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(new Integer(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("만능이네");
		System.out.println(s.get());
	}
}
