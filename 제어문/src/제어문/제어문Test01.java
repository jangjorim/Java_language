package 제어문;

import java.util.Scanner;

public class 제어문Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력해 주세요.");
		int age = sc.nextInt();

		if (age >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}
}
