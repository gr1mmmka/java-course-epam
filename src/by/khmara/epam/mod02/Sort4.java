package by.khmara.epam.mod02;

public class Sort4 {

	/*
	 * 4. Сортировка обменами. Дана последовательность чисел а[1] <= a[2] <= ... <=
	 * a[n] Требуется поставить числа в порядке возрастания Для этого сравниваются
	 * два соседних числа a[i] и a[i+1]. Если a[i] > a[i+1], то делается
	 * перестановка Также подсчитать количество перестановок
	 */

	public static void main(String[] args) {

		int count;
		int swipeCount;
		int x;
		int[] mass;

		mass = new int[] { 2, 5, 1, 0, -5, 2, 2, 2, 19 };
		swipeCount = 0;

		do {
			count = 0;

			for (int i = 0; i < mass.length - 1; i++) {

				if (mass[i] > mass[i + 1]) {
					x = mass[i];
					mass[i] = mass[i + 1];
					mass[i + 1] = x;
					swipeCount++;
				}
			}

			for (int j = 0; j < mass.length - 1; j++) {

				if (mass[j] <= mass[j + 1]) {
					count++;
				}
			}

		} while (count != mass.length - 1);

		printMass(mass);
		System.out.println("\n Count of swipes - " + swipeCount);

	}

	static void printMass(int[] mass) {

		for (int x : mass)
			System.out.print(x + " ");
	}

}
