package by.khmara.epam.mod02;

public class Sort6 {

	/*
	 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
	 * a[i] и a[i+1], если a[i] < a[i+1], то продвигаются на один элемент вперед,
	 * если a[i] > a[i+1], то производится перестановка и сдвигается на элемент
	 * назад. Составить алгоритм
	 */

	public static void main(String[] args) {
		int[] mass;

		mass = new int[] { 3, 2, 4, 1, 5, 51, -2, 0, 1, 1, 1, 2, 5, 7, 1, 7, 12, 5, 1, 78, 85, 12, 45, 6, -5, -76, -3,
				-144, -16, 18 };

		printMass(shellSort(mass));

	}

	static int[] shellSort(int[] mass) {

		int temp;
		int h;

		h = mass.length / 2;

		do {

			for (int i = 0; i < mass.length - h; i++) {

				int j = i;
				if (mass[i] > mass[i + h]) {
					while (j >= 0 && mass[j] > mass[j + h]) {
						temp = mass[j];
						mass[j] = mass[j + h];
						mass[j + h] = temp;
						j--;
					}

				}
			}
			h /= 2;
		} while (h > 0);

		return mass;
	}

	static void printMass(int[] mass) {

		for (int x : mass) {
			System.out.print(x + " ");
		}
	}

}
