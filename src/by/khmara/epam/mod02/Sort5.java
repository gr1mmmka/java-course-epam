package by.khmara.epam.mod02;

/*
 * 5. Сортировка вставками. Место помещения очередного элемента в
 * отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
 * оформить в виде отдельной функции.
 */

public class Sort5 {

	public static void main(String[] args) {
		int[] mass;

		mass = new int[] { 3, 2, 4, 1, 5, 51, -2, 0, 1, 1, 1, 2, 5, 7, 1, 7, 12, 5, 1, 78, 85, -12, -45, 2, 6 };

		insertSort(mass);
		printMass(mass);
	}

	static void insertSort(int[] mass) {
		int temp;
		int index;

		for (int i = 0; i < mass.length - 1; i++) {
			index = i;

			if (mass[i + 1] < mass[i]) {

				temp = mass[i + 1];

				int j = i;
				while (j >= 0 && temp <= mass[j]) {

					mass[j + 1] = mass[j];
					index = binSearch(mass, temp, i + 1);

					j--;
				}

				mass[index] = temp;

			}

		}
	}

	static int binSearch(int[] mass, int i, int lengthMass) {
		int end;
		int l;
		int index;

		end = lengthMass;
		l = lengthMass / 2;
		index = l;

		while (l != 0 && l != end - 1 && !(i <= mass[l] && i >= mass[l - 1])) {

			if (i < mass[l]) {
				l = l / 2;

			} else if (i > mass[l - 1]) {
				l = (l + end) / 2;

			}

			if (l == 0) {
				index = 0;
			} else if (l == end - 1) {
				index = end - 1;
			} else {
				index = l;
			}
		}
		return index;
	}

	//

	static void printMass(int[] mass) {

		for (int x : mass) {
			System.out.print(x + " ");
		}
	}

}
