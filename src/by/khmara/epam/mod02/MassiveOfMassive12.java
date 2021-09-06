package by.khmara.epam.mod02;

public class MassiveOfMassive12 {

	/*
	 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
	 */

	static int[][] mass;

	public static void main(String[] args) {

		mass = new int[][] { { 2, 5, 1, 3 }, { 1, 2, 0 }, { 1, 5, 2, 6 } };

		sortRowMass(mass);
	}

	// сортирует строки матрицы и выводит на экран

	static void sortRowMass(int[][] mass) {
		int x;

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				for (int k = j; k < mass[i].length; k++) {

					if (mass[i][j] > mass[i][k]) {

						x = mass[i][k];
						mass[i][k] = mass[i][j];
						mass[i][j] = x;
					}
				}

				System.out.print(mass[i][j] + " ");
			}

			System.out.println("");
		}
	}

}
