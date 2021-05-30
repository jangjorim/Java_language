import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int di = sc.nextInt();
		System.out.println(di % 4 == 0 && di % 5 == 0);
		System.out.println(di % 4 == 0 || di % 5 == 0);
		System.out.println(di % 4 == 0 ^ di % 5 == 0);
	}
}
