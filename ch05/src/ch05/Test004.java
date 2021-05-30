package ch05;

import java.util.Scanner;

//endsWith contains equals
public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("URL을 입력하세요.");
			String a = sc.next();

			if (a.endsWith("com"))
				System.out.println(a + "은 'com'으로 끝납니다.");
			if (a.contains("java"))
				System.out.println(a + "은 'java'를 포함합니다.");
			if (a.equals("bye"))
				break;
		}

	}

}
