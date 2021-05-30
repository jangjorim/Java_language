package ch05;

import java.util.Scanner;

public class Test005 {
	public static void main(String[] args) {
		String[] arr = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 10개 입력하세요.");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("%d ~ %d :", (0 + (10 * i)), (-1 + ()));
			if (count > 0) {
				for (int j = 0; j < count + 1; j++) {
					System.out.println("*");
				}
			}
		}

	}
}
