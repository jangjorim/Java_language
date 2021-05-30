package 객체;

public class Circle1 {
	double radius;

	double findArea() {
		return radius * radius * 3.14;
	}

	void show(double a, double b) {
		System.out.printf("반지름 : %.1f 넓이 : %.1f", a, b);
	}

}
