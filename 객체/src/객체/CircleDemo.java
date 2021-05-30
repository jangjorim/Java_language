package 객체;

class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double findArea() {
		return radius * radius * 3.14;
	}

	void show(double a, double b) {
		System.out.printf("반지름 = %.1f 넓이 = %.1f", a, b);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		myCircle.setRadius(10.0);
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}
}
