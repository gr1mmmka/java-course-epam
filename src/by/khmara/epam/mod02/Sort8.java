package by.khmara.epam.mod02;

public class Sort8 {

	/*
	 * 8.Даны дроби ( pi qi , - натуральные). Составить программу, которая приводит
	 * эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
	 */

	public static void main(String[] args) {

		int[] numerator;
		int[] denominator;

		numerator = new int[] { 2, 3, 1 };
		denominator = new int[] { 7, 5, 3 };

		maxDenom(denominator);
		numeratorNew(numerator, denominator);
		sortNumerator(numerator);

		printFractions(createFractions(numerator, denominator, findNok(denominator)));
	}

	// ищет максимальный знаменатель

	private static int maxDenom(int[] mass) {
		int max;

		max = mass[0];

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] > max) {
				max = mass[i];
			}
		}

		return max;
	}

	// ищет общий знаменатель

	private static int findNok(int[] mass) {
		int nok;
		int count;

		nok = maxDenom(mass);

		count = 0;

		while (count != mass.length) {

			for (int i = 0; i < mass.length; i++) {

				if (nok != 0 && nok % mass[i] == 0) {
					count++;
				} else {
					count = 0;
					nok++;
					break;

				}
			}

		}
		return nok;
	}

	// приводит числитель к общему знаменателю

	private static int[] numeratorNew(int[] numerator, int[] denominator) {
		int nok;

		nok = findNok(denominator);
		for (int j = 0, k = 0; j < numerator.length; j++, k++) {

			numerator[j] *= nok / denominator[k];
		}
		return numerator;
	}

	// сортирует дроби

	private static int[] sortNumerator(int[] mass) {
		int temp;

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass.length; j++) {

				if (mass[i] > mass[j]) {
					temp = mass[j];
					mass[j] = mass[i];
					mass[i] = temp;
				}

			}
		}

		return mass;
	}

	// создает двумерный массив дробей

	private static int[][] createFractions(int[] numerator, int[] denominator, int nok) {
		int[][] mass;

		mass = new int[2][numerator.length];

		for (int j = 0; j < denominator.length; j++) {

			mass[0][j] = numerator[j];
			mass[1][j] = nok;
		}

		return mass;
	}

	// выводит на экран дроби

	private static void printFractions(int[][] mass) {

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}
