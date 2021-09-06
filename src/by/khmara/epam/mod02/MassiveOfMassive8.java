package by.khmara.epam.mod02;

import java.util.Scanner;

public class MassiveOfMassive8 {

	/*
	 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры
	 */

	public static void main(String[] args) {

		int[][] mass;
		int columnOne;
		int columnTwo;
		int x;

		mass = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a column 1 - ");
		columnOne = sc.nextInt();
		System.out.println("Enter a column 2 - ");
		columnTwo = sc.nextInt();

		x = 1;

		for (int i = 0; i < mass.length; i++) {

			x = mass[i][columnOne];
			mass[i][columnOne] = mass[i][columnTwo];
			mass[i][columnTwo] = x;
		}

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}

			System.out.println("");
		}
		sc.close();
	}

}
