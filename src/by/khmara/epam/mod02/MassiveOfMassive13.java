package by.khmara.epam.mod02;

public class MassiveOfMassive13 {

	/*
	 * 13. Отсотрировать столбцы матрицы по возрастанию и убыванию значений
	 * эементов.
	 */

	static int[][] mass;

	public static void main(String[] args) {

		mass = new int[][] { { 2, 5, 1, 3 }, { 1, 2, 0, 5 }, { 1, 5, 2, 6 } };

		sortColumnMass(mass);
	}

	// сортирует столбцы матрицы по возрастанию и выводит на экран

	static void sortColumnMass(int[][] mass) {
		int x;

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				for (int k = 0; k < mass.length; k++) {

					for (int l = 0; l < mass.length; l++) {

						if (mass[k][j] < mass[l][j]) {

							x = mass[l][j];
							mass[l][j] = mass[k][j];
							mass[k][j] = x;

						}
					}
				}
				System.out.print(mass[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
