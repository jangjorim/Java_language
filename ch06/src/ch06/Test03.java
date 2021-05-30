package ch06;

class Point {
	private int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return ("x의 좌표는" + x + "y의 좌표는" + y);
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}
}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return ("x의 좌표는" + getx() + "y의 좌표는" + gety() + "x의 속도는" + xSpeed + "y의 속도는" + ySpeed);
	}
}

public class Test03 {
	public static void main(String[] args) {
		Point P = new Point(3, 4);
		MovablePoint M = new MovablePoint(4, 5, 5, 6);
		System.out.println(P.toString());
		System.out.println(M.toString());
	}
}
