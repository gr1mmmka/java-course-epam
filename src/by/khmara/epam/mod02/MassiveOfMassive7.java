package by.khmara.epam.mod02;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class MassiveOfMassive7 {

	/*
	 * 7. Сформировать квадратную матрицу порядка N по правилу: a[i,j] = sin
	 * ((i^2-j^2)/N)
	 */

	public static void main(String[] args) {

		double[][] mass;
		int n;
		int countOfPositive;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number N: ");
		n = sc.nextInt();

		mass = new double[n][n];
		countOfPositive = 0;

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {

				mass[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				MathContext context = new MathContext(2, RoundingMode.HALF_UP);
				BigDecimal result = new BigDecimal(mass[i][j], context);
				System.out.print(result + "\t\t");

				if (mass[i][j] > 0) {
					countOfPositive++;
				}
			}

			System.out.println("");
		}

		System.out.println("\nCount of positive elements of massive is " + countOfPositive);
		sc.close();
	}

}
