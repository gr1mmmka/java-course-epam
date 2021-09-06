package by.khmara.epam.mod02;

public class Massive8 {

	/*
	 * 8. Дана последовательность целых чисел a1 a2 ... an . Образовать новую
	 * последовательность, выбросив из исходной те члены, которые равны min (a1 a2
	 * ... an)
	 */

	public static void main(String[] args) {

		int[] mass;
		int[] newMass;
		int min;
		int count;

		mass = new int[] { 1, 2, 3, -1, 2, -1, 10, 5 };
		min = mass[0];
		count = 0;
		
		// находим минимальное значение
		for (int i = 0; i < mass.length; i++) {

			if (mass[i] <= min) {
				min = mass[i];
			}
		}
		
		// находим количество минимальных значений
		for (int i = 0; i < mass.length; i++) {

			if (mass[i] == min) {
				count++;
			}
		}

		newMass = new int[mass.length - count];

		for (int i = 0, j = 0; i < mass.length; i++) {

			if (mass[i] != min) {
				newMass[j] = mass[i];
				j++;

			}
		}
		
		for (int x : newMass)
			System.out.println(x);

	}

}
