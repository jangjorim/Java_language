package ch05;

public class test {
	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 1, 5 };
		int[] b = { 3, 2, 4, 1, 5, 6 };
//		int[] b = { 3, 2, 4, 1 };
//		int[] c = { 3, 2, 4, 1, 5 };
//		int[] d = { 2, 7, 1, 8, 2 };
		research(a, b);
	}

	public static void research(int[] a, int[] b) {
		boolean check = true;
		int len = a.length > b.length ? a.length : b.length;
		for (int i = 0; i < len; i++) {
			if (a[i] != b[i]) {
				check = false;
			}
		}
		System.out.println(check);
	}
}
