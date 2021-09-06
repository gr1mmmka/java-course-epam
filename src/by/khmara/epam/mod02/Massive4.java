package by.khmara.epam.mod02;

public class Massive4 {

	/*
	 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	 * наименьший элементы.
	 * 
	 */

	public static void main(String[] args) {

		int[] mass;
		int max;
		int min;
		int indexOfMin;
		int indexOfMax;

		mass = new int[] { -91, 2, 512, 12, 345, 21, 7, 5, -5 };
		max = mass[0];
		min = mass[0];
		indexOfMin = 0;
		indexOfMax = 0;

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] > max) {
				max = mass[i];
				indexOfMax = i;
			} else if (mass[i] < min) {
				min = mass[i];
				indexOfMin = i;
			}

		}

		mass[indexOfMax] = min;
		mass[indexOfMin] = max;

		for (int x : mass)
			System.out.print(x + " ");

	}

}
