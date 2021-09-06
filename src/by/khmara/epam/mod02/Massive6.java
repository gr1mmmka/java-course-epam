package by.khmara.epam.mod02;

public class Massive6 {

	/*
	 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */

	public static void main(String[] args) {

		int[] mass;
		int sum;
		int count;

		sum = 0;
		mass = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < mass.length; i++) {

			count = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 0 && i != 2 && i != 0) {
				sum += mass[i];
			}
		}

		System.out.println(sum);

	}

}
