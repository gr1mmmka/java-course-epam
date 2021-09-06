package by.khmara.epam.mod02;

public class Massive10 {

	/*
	 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив,
	 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить
	 * нулями). Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {

		int[] mass;

		mass = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 1, j = 1; i < mass.length; i++) {

			if (j > mass.length / 2) {
				mass[i] = 0;
			} else if (j <= mass.length / 2) {
				mass[i] = mass[j * 2];
				j++;
			}

		}

		for (int x : mass) {
			System.out.print(" " + x);
		}

	}

}
