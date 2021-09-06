package by.khmara.epam.mod02;

import java.util.Scanner;

public class Sort1 {

	/*
	 * 1. Заданы два одномерных массива с различным количеством элементов и
	 * натуральное число К. Объединить их в один массив, включив второй массив между
	 * К и (К+1)-м элементом первого. При этом не используя дополнительный массив
	 */

	public static void main(String[] args) {

		int k;
		int[] mass1;
		int[] mass2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 'k' - ");
		k = sc.nextInt();
		sc.close();

		mass1 = new int[] { 1, 2, 3, 4, 1, 2, 3, 1, 5 };
		mass2 = new int[] { 7, 5, 7, 5, 7 };

		printMass(concatMass(mass1, mass2, k));

	}

	// объединяет два массива в один

	static int[] concatMass(int[] mass1, int[] mass2, int k) {

		int i;
		int j;
		int[] mass3;

		mass3 = new int[mass1.length + mass2.length];
		i = 0;
		j = 0;

		do {
			mass3[i] = mass1[i];
			i++;
		} while (i != k + 1);

		do {
			mass3[i] = mass2[j];
			i++;
			j++;
		} while (j < mass2.length);

		do {
			mass3[i] = mass1[i - mass2.length];
			i++;
		} while (i < mass3.length);

		return mass3;
	}

	// печатает массив в консоль

	static void printMass(int[] mass) {

		for (int x : mass) {
			System.out.print(x + " ");
		}
	}
}
