package by.khmara.epam.mod02;

public class Sort3 {

	/*
	 * 3. Сортировка выбором Дана последовательность чисел а[1] <= a[2] <= ... <=
	 * a[n] Требуется переставить элементы чтобы они были расположены по убыванию
	 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
	 * ставится на первое место, а первый - на место наибольшего. Затем процедура
	 * повторяется начиная со второго элемента. И т.д.
	 */

	public static void main(String[] args) {

		int[] mass;

		mass = new int[] { 2, 5, 2, 3, 2 };

		mass = sortMass(mass);

		printMass(mass);

	}

	static int[] sortMass(int[] mass) {
		int x;
		int max;
		int indexOfMax;

		for (int i = 0; i < mass.length; i++) {
			max = mass[0];
			indexOfMax = 0;

			for (int j = 0; j < mass.length - i; j++) {

				if (mass[j] > max) {

					max = mass[j];
					indexOfMax = j;
				}
			}

			x = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = max;
			mass[indexOfMax] = x;
		}

		return mass;
	}

	static void printMass(int[] mass) {

		for (int x : mass) {
			System.out.print(x + " ");
		}
	}
}
