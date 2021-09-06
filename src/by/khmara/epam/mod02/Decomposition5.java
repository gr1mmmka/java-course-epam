package by.khmara.epam.mod02;

public class Decomposition5 {

	/*
	 * 5. Составить программу, которая в массиве A[N] находит второе по величине
	 * число (вывести на печать число, которое меньше максимального элемента
	 * массива, но больше всех других элементов).
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 5, 1, 11, 2 };
		System.out.println(secondMaxFinder(arr));

	}

	public static int secondMaxFinder(int[] mass) {
		int maxValue;
		int secondMaxValue;
		int index;

		maxValue = mass[0];
		secondMaxValue = mass[0];
		index = 0;

		for (int i = 1; i < mass.length; i++) {
			if (mass[i] > maxValue) {
				maxValue = mass[i];
				index = i;
			}
		}

		for (int i = 1; i < mass.length; i++) {
			if (mass[i] > secondMaxValue && i != index) {
				secondMaxValue = mass[i];
			}
		}

		return secondMaxValue;
	}

}
