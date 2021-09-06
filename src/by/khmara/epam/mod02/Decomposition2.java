package by.khmara.epam.mod02;

public class Decomposition2 {

	/*
	 * 2. Написать методы для нахождения наибольшего общего делителя для четырех
	 * натуральных чисел
	 */

	public static void main(String[] args) {

		System.out.print("Наибольший общий делитель - " + nod(20, 80, 24, 36));

	}

	public static int nod(int a, int b, int c, int d) {

		int maxDivisor;
		int i;

		i = 2;
		maxDivisor = 1;

		while (a >= i) {

			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				maxDivisor = i;
			}

			i++;
		}

		return maxDivisor;
	}

}
