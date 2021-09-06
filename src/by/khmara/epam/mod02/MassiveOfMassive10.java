package by.khmara.epam.mod02;

public class MassiveOfMassive10 {

	/*
	 * 10. Найти положительные элементы главной диагонали квадратной матрицы
	 */

	public static void main(String[] args) {

		int[][] mass;

		mass = new int[][] { { 1, 2, 3 }, { 1, -4, 1 }, { 1, 2, 3 } };

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				if (mass[i][j] > 0 && i == j) {
					System.out.print(mass[i][j] + " ");
				}
			}
		}
	}

}
