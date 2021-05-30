package ch06;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void show() {
		System.out.println("사람 [ 이름 :" + name + ", 나이 :" + age + "]");
	}

}

class Student extends Person {
	private int hakbun;

	Student(String name, int age, int hakbun) {
		super(name, age);
		this.hakbun = hakbun;

	}

	int getHakbun() {
		return hakbun;
	}

	void show() {
		System.out.println("사람 [ 이름 :" + name + ", 나이 :" + age + ", 학번 :" + hakbun + "]");
	}
}

class ForeignStudent extends Student {
	String gukjuk;

	ForeignStudent(String name, int age, int hakbun, String gukjuk) {
		super(name, age, hakbun);
		this.gukjuk = gukjuk;
	}

	void show() {
		System.out.println("사람 [ 이름 :" + name + ", 나이 :" + age + ", 학번 :" + getHakbun() + "국적" + gukjuk + "]");
	}

}

public class Test02 {
	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("길동이", 22);
		p[1] = new Student("황진이", 23, 100);
		p[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

		Person[] p1 = { new Person("길동이", 22), new Student("황진이", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };

		for (Person i : p) {
			i.show();
		}

		for (Person i : p1) {
			i.show();
		}
	}
}
