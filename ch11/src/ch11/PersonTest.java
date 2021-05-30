package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + ":" + this.age);
	}

	@Override
	public String toString() {

		return "Person [" + name + "," + age + "] ";
	}

	public boolean equals(Object o) {
		if (o instanceof Person) {
			return ((Person) o).name.equals(name);
		}
		return false;

	}

	public int hashCode() {
		return name.hashCode();
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));

		Iterator<Person> it1 = set.iterator();
		while (it1.hasNext()) {
			System.out.print(it1.next());
		}

	}
}
