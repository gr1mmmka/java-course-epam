package by.khmara.epam.mod02;

public class MassiveOfMassive1 {

	/*
	 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
	 * элемент больше второго
	 */

	public static void main(String[] args) {

		int[][] mass;
		int i;
		int indexJ;

		mass = new int[][] { { 4, 3, 3, 25, 3 }, { 5, 3, 3, 3, 3 }, { 4, 2, 13, 3, 3 }, { 21, 2, 31, 0, 0 } };

		for (int j = 0; j < mass[0].length; j++) {
			indexJ = j;

			if (j % 2 != 0 && mass[0][j] > mass[mass.length - 1][j]) {
				System.out.println("column:");
				for (i = 0; i < mass.length; i++) {

					System.out.print(mass[i][indexJ] + " ");

				}
				System.out.println("");
			}

		}

	}
}
