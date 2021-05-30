import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("전공 이수 학점 :");
		int $jun = sc.nextInt();
		System.out.print("교양 이수 학점 :");
		int gyo = sc.nextInt();
		System.out.print("일반 이수 학점 :");
		int _il = sc.nextInt();
		boolean tf = ($jun >= 70 && $jun + gyo + _il >= 140 && ((gyo >= 30 && _il >= 30) || gyo + _il >= 80)) ? true
				: false;
		String prin = (tf == true) ? ("졸업 가능") : ("졸업 학점 미달");
		System.out.print(prin);

	}
}
