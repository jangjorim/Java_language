package ch04;

public class Complex {
	double a, b;

	Complex(double a) {
		this(a, 3.5);
	}

	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	void print() {
		System.out.println(a + "+" + b + "i");
	}
}
