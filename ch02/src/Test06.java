import java.util.Scanner;

//화씨를 섭씨로 바꾸는 코드
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f = sc.nextInt();
		double c = (f - 32) * 5 / 9;
		System.out.printf("%.1f", c);
	}
}
