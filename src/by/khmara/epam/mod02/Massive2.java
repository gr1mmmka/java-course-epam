package by.khmara.epam.mod02;

public class Massive2 {

	/*
	 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
	 * которые кратны данному К 2. Дана последовательность действительных чисел а1
	 * ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
	 * Подсчитать количество замен
	 */

	public static void main(String[] args) {

		int[] mass;
		int count;
		int z;

		count = 0;
		z = 4;
		mass = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 111 };

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] > z) {
				mass[i] = z;
				count++;
			}
		}

		System.out.println("Новый массив");
		for (int x : mass)
			System.out.print(x + " ");

		System.out.println("\n" + "Количество замен - " + count);
	}

}
