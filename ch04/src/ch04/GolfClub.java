package ch04;

public class GolfClub {
	int number;
	String name;

	GolfClub() {
		number = 7;
		name = "아이언";
	}

	GolfClub(int number) {
		this.number = number;
		name = "아이언";
	}

	GolfClub(String name) {
		this.name = name;
	}

	void print() {
		if (number != 0)
			System.out.println(number + "번" + name + "입니다.");
		else
			System.out.println(name + "입니다.");
	}
}
