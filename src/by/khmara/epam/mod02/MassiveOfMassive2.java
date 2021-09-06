package by.khmara.epam.mod02;

public class MassiveOfMassive2 {

	/*
	 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонале
	 */

	public static void main(String[] args) {

		int[][] mass;

		mass = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				if (i == j) {
					System.out.print(mass[i][j] + " ");
				}
			}
		}
	}

}
