package by.khmara.epam.mod02;

public class Massive7 {

	/*
	 * Даны действительные числа a1, a2, ... an. Найти max(a1 + an, a2 +an-2, ....
	 * am + an-m) .
	 */

	public static void main(String[] args) {

		int[] mass;
		int max;
		int length;
		int sum;

		mass = new int[] { 1, 2, 31, 4, 511, 6, 7, 9, 10 };
		length = mass.length - 1;
		max = mass[0] + mass[length];

		for (int i = 1; i < mass.length - 1; i++) {

			if (length - i != i) {
				sum = mass[i] + mass[length - i];
			} else
				sum = mass[i];

			if (max < sum) {
				max = sum;
			}

		}

		System.out.println(max);

	}

}
