package by.khmara.epam.mod02;

import java.util.Scanner;

public class MassiveOfMassive4 {

	/*
	 * 4. Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)
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

				if (i == 0 || i % 2 == 0) {
					mass[i][j] = j + 1;
					System.out.print(mass[i][j] + " ");
				} else {
					mass[i][j] = n - j;
					System.out.print(mass[i][j] + " ");
				}
			}

			System.out.println("");
		}
		sc.close();
	}

}
