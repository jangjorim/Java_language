package 객체;

public class CircleDemo1 {
	public static void main(String[] args) {
		Circle1 myCircle = new Circle1();
		myCircle.radius = 10.0;
		myCircle.show(myCircle.radius, myCircle.findArea());
	}
}
