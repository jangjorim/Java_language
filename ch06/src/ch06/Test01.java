package ch06;

class Circle {
	int radius;

	void show() {
		System.out.println("반지름이" + radius + "인 원이다.");
	}

	Circle(int radius) {
		this.radius = radius;
	}
}

class ColoredCircle extends Circle {
	String color;

	void show() {
		System.out.println("반지름이" + radius + "인" + color + "원이다.");
	}

	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		c1.show();

		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		c2.show();

		Circle c3 = new ColoredCircle(20, "파랑색");
		c3.show();
		System.out.println(c3.radius);
	}
}
