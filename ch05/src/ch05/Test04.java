package ch05;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("URL을 입력하세요 : ");
			String a = sc.next();

			if (a.endsWith("com"))
				System.out.println("com으로 끝납니다.");
			if (a.contains("java"))
				System.out.println("java를 포함합니다.");
			if (a.equals("bye"))
				break;
		}

	}
}
