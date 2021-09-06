package by.khmara.epam.mod02;

public class MassiveOfMassive9 {

	/*
	 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить какой столбец содержит максимальную сумму
	 */

	public static void main(String[] args) {

		int[][] mass;
		int sum;
		int maxSum;

		mass = new int[][] { { 1, 2, 3, 4 }, { 1, 4, 1, 4 }, { 1, 2, 3, 4 } };

		maxSum = 0;

		for (int j = 0; j < mass[0].length; j++) {
			sum = 0;

			for (int i = 0; i < mass.length; i++) {

				sum += mass[i][j];
			}

			System.out.println("Sum of column ¹" + j + " = " + sum);

			if (sum > maxSum) {
				maxSum = sum;
			}

		}

		System.out.println("maxSum = " + maxSum);
	}
}
