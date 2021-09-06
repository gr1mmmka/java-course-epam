package by.khmara.epam.mod02;

public class Massive5 {

	/*
	 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
	 * которых аi > i.
	 */

	public static void main(String[] args) {

		int[] mass;

		mass = new int[] { 1, 3, 2, 5, 1, 2, 21, 0, 2, 1, 89 };

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] > i) {
				System.out.print(mass[i] + " ");
			}
		}

	}

}
