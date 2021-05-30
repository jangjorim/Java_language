package 객체;

class Triangle {
	double a;
	double b;
	double sum;

	Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public boolean isSameArea(Triangle c) {
		sum = a * b / 2;
		c.sum = c.a * c.b / 2;
		if (sum == c.sum) {
			return true;
		} else {
			return false;
		}
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}
}
