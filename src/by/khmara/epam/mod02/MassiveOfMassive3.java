package by.khmara.epam.mod02;

import java.util.Scanner;

public class MassiveOfMassive3 {

	/*
	 * 3. Дана матрица. Вывести k-ю строку и р-й столбец матрицы
	 */

	static int[][] mass;

	public static void main(String[] args) {

		int p;
		int k;

		mass = new int[][] { { 4, 3, 3, 25, 3 }, { 5, 3, 3, 3, 3 }, { 4, 2, 13, 3, 3 }, { 21, 2, 31, 0, 0 } };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number of ROW");
		k = sc.nextInt();

		printRow(k);

		System.out.println("\nEnter a number of COLUMN");
		p = sc.nextInt();

		printColumn(p);

		sc.close();

	}

	static void printRow(int k) {
		for (int j = 0; j < mass[k].length; j++) {

			System.out.print(mass[k][j] + " ");
		}
	}

	static void printColumn(int p) {
		for (int i = 0; i < mass.length; i++) {

			System.out.println(mass[i][p]);
		}
	}

}
