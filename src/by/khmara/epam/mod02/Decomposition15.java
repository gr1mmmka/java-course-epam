package by.khmara.epam.mod02;

import static java.lang.Math.pow;

public class Decomposition15 {

	/*
	 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */

	static double n;

	public static void main(String[] args) {

		n = 4;

		isIncreasingSequence();

	}

	public static void isIncreasingSequence() {

		int count;
		String str;

		for (int i = (int) pow(10, n - 1); i < pow(10, n) - 1; i++) {

			count = 0;
			str = i + "";

			for (int j = 0; j < str.length() - 1; j++) {

				if (str.charAt(j) < str.charAt(j + 1)) {
					count++;
				}
			}

			if (count == n - 1) {
				System.out.println(i);
			}

		}

	}

}
