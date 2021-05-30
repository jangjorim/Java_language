package ch05;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5));
	}

	static int sum(int i, int... var) { // ... <-- 가변변수
		int s = 0;
		for (int v : var) {
			s = s + v;
		}
		return s;
	}
}
//	static int sum(int a, int b, int c, int d) {
//		return b + c + d;
//	}
//
//	static int sum(int a, int[] b) {
//		int s = 0;
//		for (int i = 0; i < b.length; i++) {
//			s = s + b[i];
//		}
//		return s;
//
//	}
