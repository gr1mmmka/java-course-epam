package by.khmara.epam.mod02;

import java.util.Scanner;

public class Decomposition4 {

	/*
	 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы),
	 * определяющие, между какими из пар точек самое большое расстояние. Указание.
	 * Координаты точек занести в массив.
	 */

	static double[] mass;

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество точек");
		n = sc.nextInt();

		mass = new double[n * 2];

		System.out.println("Введите координаты точек поочереди");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = sc.nextDouble();
		}
		sc.close();
		System.out.println(maxDistance());

	}

	public static double maxDistance() {
		double maxDistance;
		double distance;

		maxDistance = 0;

		for (int i = 0; i < mass.length - 1; i++) {

			int j = 0;

			for (j = 0; j < mass.length - 3; j += 2) {

				distance = Math.sqrt(Math.pow(mass[j + 2] - mass[i], 2) + Math.pow(mass[j + 3] - mass[i + 1], 2));

				if (distance > maxDistance) {
					maxDistance = distance;
				}
			}
		}

		return maxDistance;
	}

}
