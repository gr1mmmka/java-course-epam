package by.khmara.epam.mod02;

public class Decomposition1 {

	/*
	 * 1. Написать методы для нахождения наименьшего общего кратного и наибольшего
	 * общего делителя для двух натуральных чисел
	 */

	public static void main(String args[]) {

		System.out.println("Íàèìåíüøåå îáùåå êðàòíîå ðàâíî - " + nok(17, 81));
		System.out.print("Íàèáîëüøèé îáùèé äåëèòåëü ðàâåí - " + nod(17, 81));

	}

	public static int nod(int a, int b) {

		int maxDivisor;
		int i;

		i = 2;
		maxDivisor = 1;

		while (a >= i) {

			if (a % i == 0 && b % i == 0) {
				maxDivisor = i;
			}

			i++;
		}

		return maxDivisor;
	}

	public static int nok(int a, int b) {

		int minMultiply;
		int i;
		boolean isMultiply;

		minMultiply = 0;
		isMultiply = true;
		i = a;

		while (isMultiply) {

			if (i % b == 0 && i % a == 0) {
				minMultiply = i;
				isMultiply = false;
			}

			i++;
		}

		return minMultiply;
	}
}
