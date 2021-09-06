package by.khmara.epam.mod02;

public class Decomposition7 {

	/*
	 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных
	 * чисел от 1 до 9.
	 */

	public static void main(String[] args) {

		System.out.print(sumOfEvenFactorials());

	}

	public static int sumOfEvenFactorials() {

		int sum;
		int factorial;

		sum = 0;

		for (int i = 1; i <= 9; i += 2) {

			factorial = 1;

			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}

			sum += factorial;
		}

		return sum;
	}

}
