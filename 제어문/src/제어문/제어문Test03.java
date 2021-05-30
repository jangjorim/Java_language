package 제어문;

import java.util.Scanner;

public class 제어문Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.print("양의 정수를 입력학세요.");
			number = sc.nextInt();

			if (number % 2 == 0)
				sum += number;

		} while (number > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은" + sum);
	}
}
