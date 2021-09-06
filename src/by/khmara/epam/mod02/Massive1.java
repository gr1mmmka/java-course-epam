package by.khmara.epam.mod02;

public class Massive1 {

	/*
	 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
	 * которые кратны данному К
	 */

	public static void main(String[] args) {
		int[] mass;
		int sum;
		int k;

		sum = 0;
		k = 3;
		mass = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] % k == 0) {
				sum += mass[i];
			}
		}

		System.out.println(sum);

	}

}
