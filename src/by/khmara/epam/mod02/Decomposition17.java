package by.khmara.epam.mod02;

public class Decomposition17 {

	/*
	 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
	 * его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
	 * Для решения задачи использовать декомпозицию.
	 */

	static int n;

	public static void main(String[] args) {

		n = 24;

		System.out.println(a());

	}

	public static int a() {

		int count;

		count = 0;

		while (n > 0) {
			n -= sumOfNumbers();
			count++;
		}
		return count;
	}

	public static int sumOfNumbers() {

		int sum;
		String str;

		str = n + "";
		sum = 0;

		for (int i = 0; i < str.length(); i++) {

			sum += Character.digit(str.charAt(i), 10);

		}

		return sum;
	}

}
