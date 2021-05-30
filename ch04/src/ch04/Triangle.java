package ch04;

public class Triangle {
	private double base;
	private double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	double getBase() {
		return base;
	}

	double getHeight() {
		return height;
	}

	double findArea() {
		return getBase() * getHeight() * 0.5;
	}

//	boolean isSameArea(Triangle t2) {
//		if (this.findArea() == t2.findArea())
//			return true;
//
//		else
//			return false;
//	}
}
