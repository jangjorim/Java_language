package 제어문;

public class 제어문Test04 {
	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 5; i++) {
			System.out.println();
			for (j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
		}
	}
}