import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		int sum = input / 100; // 셋째자리
		sum = sum + input / 10 % 10; // 둘째자리
		sum = sum + input % 10; // 첫째자리
		System.out.print("각 자리수의 합 =" + sum);
	}
};
