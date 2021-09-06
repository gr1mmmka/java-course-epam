package by.khmara.epam.mod02;

import static java.lang.Math.pow;

public class Decomposition14 {

	/*
	 * 14. Натуральное число, в записи которого n цифр, называется числом
	 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
	 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать
	 * декомпозицию.
	 */

	static String str;

	public static void main(String[] args) {
		isArmstrong();
	}

	public static void isArmstrong() {
		int a;
		int k;

		k = 1000;

		for (int i = 10; i <= k; i++) {

			a = sumOfNumbers(i);

			if (a == i) {
				System.out.println(i);
			}

		}
	}

	public static int sumOfNumbers(int n) {
		str = n + "";
		int sum;
		int l;

		l = str.length();
		sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += pow((Character.digit(str.charAt(i), 10)), l);
		}
		return sum;
	}

}
