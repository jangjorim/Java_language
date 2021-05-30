package ch05;

public class Array2Demo {
	public static void main(String[] args) {
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };

		double sum2 = 0.0;
		double sum = 0;
		int k = 0;

		for (double[] i : interests) {
			k++;
			for (double j : i) {
				sum2 += j;
				sum += j;
			}

			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", k, sum / 4);
			k++;
			sum = 0;
		}
		System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2 / 3);
	}
}
