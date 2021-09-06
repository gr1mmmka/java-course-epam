package by.khmara.epam.mod02;

import java.util.Random;

public class Decomposition8 {

	/*
	 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
	 * D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
	 * вычисления суммы трех последовательно расположенных элементов массива с
	 * номерами от k до m.
	 */

	static int[] mass = new int[15];

	public static void main(String[] args) {

		fillMass();

		System.out.println("Сумма элементов массива с 3-ого по 7-ой равна = " + sumOfMassElements(3, 7));

	}

	public static int[] fillMass() {

		Random r = new Random();

		for (int i = 0; i < mass.length; i++) {
			mass[i] = r.nextInt(15);
		}

		return mass;

	}

	public static int sumOfMassElements(int k, int m) {
		int sum;

		sum = 0;

		for (int i = k; i <= m; i++) {
			sum += mass[i];
		}

		return sum;
	}
}
