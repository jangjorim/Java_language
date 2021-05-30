package ch05;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[] { 15, 57, 37, 79, 95, 14, 17, 25, 88, 55 };
		int[] cnt = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.println("숫자를 10개 입력하세요 :");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			cnt[num[i] / 10]++;
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.print(i * 10 + "~" + ((i * 10) + 9) + ":" + cnt[i]);
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
