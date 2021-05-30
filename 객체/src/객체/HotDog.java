package 객체;

class Dog {
	private String name;
	String breed;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("강아지 이름 : %s / 강아지 나이 : %d \n", name, age);
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;

		System.out.printf("강아지 이름 : %s / 강아지 종류 : %s / 강아지 나이 : %d", name, breed, age);
	}

}

public class HotDog {
	public static void main(String[] args) {
		Dog dog1 = new Dog("짱구", 3);
		Dog dog2 = new Dog("흰둥이", "진돗개", 7);
	}
}
