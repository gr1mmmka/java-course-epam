package by.khmara.epam.mod02;

public class Sort7 {

	/*
	 * 7. Пусть даны две неубывающие последовательности действительных чисел a1 <=
	 * a2 <=....<= an и b1 <= b2 <=....<= bm . Требуется указать те места, на
	 * которые нужно вставлять элементы последовательности b1 <= b2 ....<= bm в
	 * первую последовательность так, чтобы новая последовательность оставалась
	 * возрастающей.
	 */

	public static void main(String[] args) {
		int[] massA;
		int[] massB;

		massA = new int[] { 1, 7, 11, 15 };
		massB = new int[] { -5, 16 };

		for (int x : concatMass(massA, massB))
			System.out.print(x + " ");

	}

	static int[] concatMass(int[] massA, int[] massB) {
		int[] massAB;

		massAB = new int[massA.length + massB.length];

		// записывает массив №1

		for (int j = 0, i = 0; j < massAB.length; j++, i++) {

			massAB[j] = massA[i];

			if (i > massA.length - 2)
				break;
		}

		// записывает по возрастанию массив №2

		for (int k = 0; k < massB.length; k++) {
			int lengthMass;

			lengthMass = massA.length;
			lengthMass += k;

			for (int l = lengthMass - 1; l >= 0; l--) {

				if (massB[k] <= massAB[l]) {

					massAB[l + 1] = massAB[l];
					massAB[l] = massB[k];

				} else {
					massAB[l + 1] = massB[k];
					break;
				}
			}
		}
		return massAB;
	}

}
