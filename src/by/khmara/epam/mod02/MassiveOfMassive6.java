package by.khmara.epam.mod02;

import java.util.Scanner;

public class MassiveOfMassive6 {

	/*
	 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	 * нечетное):
	 */

	public static void main(String[] args) {

		int n;
		int[][] mass;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number n: ");
		n = sc.nextInt();

		mass = new int[n][n];

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				mass[i][j] = 1;

				for (int k = 0; k < mass[i].length; k++) {

				}

				System.out.print(mass[i][j] + " ");
			}

			System.out.println(" ");
		}
		sc.close();
	}

}
