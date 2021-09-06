package by.khmara.epam.mod02;

public class Massive9 {

	/*
	 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */

	public static void main(String[] args) {

		int[] mass;
		int count;
		int repeats;
		int index;

		mass = new int[] { 1, 2, 2, 3, 3, 3, 3, 4, 5, 6, -1, -1, -1, -1 };
		repeats = 0;
		index = 0;

		for (int i = 0; i < mass.length; i++) {
			count = 0;

			for (int j = 0; j < mass.length; j++) {

				if (mass[i] == mass[j]) {
					count++;
				}
			}

			if (count >= repeats) {
				repeats = count;
				index = i;

				if (mass[index] > mass[i]) {
					index = i;
				}
			}
		}

		System.out.print(index);

	}

}
