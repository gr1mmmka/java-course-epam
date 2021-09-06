package by.khmara.epam.mod02;

import java.util.Random;
import java.util.Scanner;

public class Decomposition12 {
	
	/*
	 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива
	 * А, элементами которого являются числа, сумма цифр которых равна К и которые
	 * не большее N.
	 */
	
	static int k;
	static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("sum of elements of number - ");
		n = sc.nextInt();

		System.out.println("no bigger than - ");
		k = sc.nextInt();
		
		sc.close();
		
		printMass();
	}

	public static int[] createMass(int a, int b) {
		int[] mass;
		int sum;
		String str;

		mass = new int[3];

		Random r = new Random();

		for (int i = 0; i < 3; i++) {

			while (true) {

				int rand = r.nextInt(b);

				str = rand + "";
				sum = 0;
				for (int j = 0; j < str.length(); j++) {
					sum += Character.digit(str.charAt(j), 10);
				}

				if (rand < k && sum == n) {

					mass[i] = rand;
					break;
				}
			}
		}

		return mass;
	}

	public static void printMass() {
		for (int x : createMass(n, k))
			System.out.println(x);
	}

}
