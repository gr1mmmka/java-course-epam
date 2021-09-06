package by.khmara.epam.mod02;

public class MassiveOfMassive14 {

	/*
	 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
	 * в каждом столбце число единиц равно номеру столбца.
	 */

	static int[][] mass = new int[7][8];

	public static void main(String[] args) {

		printMass();

	}

	// печатает новый массив

	static void printMass() {
		mass = creatMass();
		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}

			System.out.println("");
		}
	}

	// создает массив из 0 и 1, где количество 1 равно номеру стобца

	static int[][] creatMass() {

		int countOfOne = 0;
		int j;

		j = 0;

		while (j < mass[0].length) {

			countOfOne = 0;

			for (int k = 0; k < mass.length; k++) {

				mass[k][j] = (int) (Math.random() * 2);

				if (mass[k][j] == 1) {
					countOfOne++;
				}

			}

			while (countOfOne != j) {

				countOfOne = 0;

				for (int k = 0; k < mass.length; k++) {

					mass[k][j] = (int) (Math.random() * 2);

					if (mass[k][j] == 1) {
						countOfOne++;
					}

				}
			}

			j++;
		}
		return mass;
	}

}
