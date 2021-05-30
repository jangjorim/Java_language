package ch04;

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
		System.out.println(t.getBase());
		System.out.println(t.getHeight());

		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(10.0, 5.0);
		Triangle t4 = new Triangle(8.0, 8.0);
		System.out.println();
//		System.out.println(t.isSameArea(t2));
//		System.out.println(t.isSameArea(t3));
//		System.out.println(t.isSameArea(t4));

	}
}
