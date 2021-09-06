package by.khmara.epam.mod02;

public class Sort2 {

	/*
	 * 2. Даны 2 упорядоченные по возрастания последовательности. Образовать из них
	 * новую упорядоченную последовательность
	 */

	public static void main(String[] args) {

		int[] mass1;
		int[] mass2;

		mass1 = new int[] { 1, 2, 3, 4, 5 };
		mass2 = new int[] { -4, 2, 4, 9, 12 };

		printMass(sortMass(concatMass(mass1, mass2)));

	}

	static int[] concatMass(int[] mass1, int[] mass2) {

		int[] mass3;
		int j;
		int k;

		mass3 = new int[mass1.length + mass2.length];
		j = 0;
		k = 0;

		for (int i = 0; i < mass3.length; i++) {

			if (i < mass1.length) {
				mass3[i] = mass1[j];
				j++;
			} else {
				mass3[i] = mass2[k];
				k++;
			}
		}
		return mass3;
	}

	static int[] sortMass(int[] mass) {
		int x;

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass.length; j++) {

				if (mass[i] < mass[j]) {
					x = mass[j];
					mass[j] = mass[i];
					mass[i] = x;
				}
			}
		}
		return mass;
	}

	static void printMass(int[] mass) {

		for (int x : mass) {
			System.out.print(x + " ");
		}
	}
}
