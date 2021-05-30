package ch04;

public class Car {
	String color;
	static int countNumOfCar;
	static int countNumOfRedCar;

	Car(String color) {
		this.color = color;
		countNumOfCar++;
		if (color.compareToIgnoreCase("red") == 0) {
			countNumOfRedCar++;
		}
	}

	static int getNumOfCar() {
		return countNumOfCar;
	}

	static int getNumOfRedCar() {
		return countNumOfRedCar;
	}

}
