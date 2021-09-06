package by.khmara.epam.mod02;

public class MassiveOfMassive15 {

	/*
	 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на
	 * него
	 */

	static int[][] mass;

	public static void main(String[] args) {

		mass = new int[][] { { 2, 5, 1, 3 }, { 1, 2, 0, 5 }, { 1, 5, 2, 6 } };

		changeOddOnMaxAndPrint(mass);
	}

	// ищет максимальный элемент массива

	static int maxFinder(int[][] mass) {
		int max;
		max = mass[0][0];

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				if (mass[i][j] > max) {

					max = mass[i][j];
				}
			}
		}
		return max;
	}

	// меняет все нечетные элементы на максимальный и выводит на экран

	static void changeOddOnMaxAndPrint(int[][] mass) {
		int max;

		max = maxFinder(mass);
		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				if (mass[i][j] % 2 != 0) {

					mass[i][j] = max;
				}

				System.out.print(mass[i][j] + " ");
			}

			System.out.println(" ");
		}

	}

}
