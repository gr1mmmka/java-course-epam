package by.khmara.epam.mod02;

import java.util.Random;

public class MassiveOfMassive11 {

	/*
	 * 11. Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран
	 * саму матрицу и количество строк, в которых число 5 встречается три и более раз
	 */

	static int[][] mass;

	public static void main(String[] args) {

		mass = new int[10][20];

		createMass();

		findRows();

	}

	// заполняет матрицу случайными значениями от 1 до 15

	static void createMass() {

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {
				Random r = new Random();

				mass[i][j] = r.nextInt(16);

				System.out.print(mass[i][j] + "\t");

			}

			System.out.println(" ");
		}
	}

	// ищет строки, в который 5 встречается 3 и более раз

	static void findRows() {

		int count;

		for (int i = 0; i < mass.length; i++) {
			count = 0;

			for (int j = 0; j < mass[i].length; j++) {

				if (mass[i][j] == 5) {
					count++;
				}
			}

			if (count >= 3)
				System.out.println("Number of row, where 5 is meeting three or more times - " + i);
		}
	}

}
