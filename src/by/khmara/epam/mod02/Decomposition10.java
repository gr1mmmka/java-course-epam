package by.khmara.epam.mod02;

import java.util.Scanner;

public class Decomposition10 {

	/*
	 * 10. Дано натуральное число N. Написать метод(методы) для формирования
	 * массива, элементами которого являются цифры числа N.
	 */

	public static void main(String[] args) {

		try {
			long number;
			number = Long.parseLong(enterNumber());

			for (long x : fillMass(number)) {
				System.out.print(x + " ");
			}

		} catch (Exception e) {
			System.out.println("You entered not a number :(");
		}

	}

	public static String enterNumber() {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}

	public static int[] fillMass(long n) {

		int[] mass;
		String str;

		str = n + "";
		mass = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			mass[i] = Character.digit(str.charAt(i), 10);
		}

		return mass;
	}
}
