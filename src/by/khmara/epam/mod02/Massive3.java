package by.khmara.epam.mod02;

public class Massive3 {

	/*
	 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать,
	 * сколько в нем отрицательных, положительных и нулевых элементов
	 */

	public static void main(String[] args) {

		int[] mass;
		int countOfNegative;
		int countOfPositive;
		int countOfZero;

		mass = new int[] { 1, 3, -2, -1, 0, 2, 1, 5 };
		countOfNegative = 0;
		countOfPositive = 0;
		countOfZero = 0;

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] < 0) {
				countOfNegative++;
			} else if (mass[i] > 0) {
				countOfPositive++;
			} else if (mass[i] == 0) {
				countOfZero++;
			}
		}

		System.out.println("Количество отрицательных - " + countOfNegative);
		System.out.println("Количество положительных - " + countOfPositive);
		System.out.println("Количество нулевых - " + countOfZero);

	}

}
