package ch06;

class Vehicle {

	String color;
	int speed;

	public Vehicle(String a, int b) {
		this.color = a;
		this.speed = b;
	}

	void show() {
		System.out.println("자동차 색깔은" + color + "속도는" + speed);
	}
}

class Car extends Vehicle {

	int displacement;
	int gears;

	public Car(String c, int d, int e, int f) {
		super(c, d);
		this.displacement = e;
		this.gears = f;
	}

	void show() {
		System.out.println("자동차 색깔은" + color + " 속도는" + " 배기량은" + displacement + " 기어단수는" + gears);
	}
}

public class Test06 {
	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}
}
