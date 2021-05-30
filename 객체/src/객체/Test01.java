package 객체;

public class Test01 {
	double a;// 삼각형 가로
	double b;// 삼각형 세로

	public double findArea() {
		double sum;
		sum = (a * b / 2);
		return sum;
	}

	Test01(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Test01 t = new Test01(10.0, 5.0);
		System.out.println(t.findArea());
	}
}
