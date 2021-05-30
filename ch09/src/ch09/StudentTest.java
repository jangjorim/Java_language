package ch09;

class Student {
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

}

public class StudentTest {
	public static void main(String[] args) {
		System.out.println(new Student("김삿갓"));
		System.out.println(new Student("홍길동"));
	}
}
