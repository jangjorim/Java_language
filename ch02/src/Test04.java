import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 :");
		int input = sc.nextInt();
		int hour = input / 3600;
		input = input % 3600;
		int min = input / 60;
		int sec = input % 60;
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);

	}
}
