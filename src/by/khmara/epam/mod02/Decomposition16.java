package by.khmara.epam.mod02;

import static java.lang.Math.pow;

public class Decomposition16 {

	/*
	 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих
	 * только нечетные цифры. Определить также, сколько четных цифр в найденной
	 * сумме. Для решения задачи использовать декомпозицию.
	 */

	static int n;

	public static void main(String[] args) {

		n = 2;

		System.out.println(isNumbersOdd() + " - " + evenNumbers());

	}

	public static int isNumbersOdd() {

		int count;
		int sum;
		String str;

		sum = 0;

		for (int i = (int) pow(10, n - 1); i < pow(10, n) - 1; i++) {

			count = 0;
			str = i + "";

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) % 2 != 0) {
					count++;
				}
			}

			if (count == n) {
				sum += i;
			}

		}
		return sum;
	}

	public static int evenNumbers() {

		String str;
		int sum;
		int countEven;

		countEven = 0;
		sum = isNumbersOdd();

		str = sum + "";

		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) % 2 == 0) {
				countEven++;
			}
		}

		return countEven;

	}

}
