package by.khmara.epam.mod02;

public class Decomposition13 {

	/*
	 * 13. Два простых числа называются «близнецами», если они отличаются друг от
	 * друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из
	 * отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
	 * задачи использовать декомпозицию.
	 */

	static int n;
	static int[] mass;

	public static void main(String[] args) {

		n = 40;

		simpleCouple();
	}

	public static int[] createMass() {
		mass = new int[n + 1];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = n;
			n++;
		}

		return mass;
	}

	public static void simpleCouple() {
		int count;
		mass = createMass();

		for (int i = 0; i < mass.length - 2; i++) {
			count = 0;
			for (int j = 2; j < mass[i]; j++) {

				if (mass[i] % j == 0 && mass[i + 2] % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Couple of simple numbers - " + mass[i] + " " + mass[i + 2]);
			}

		}

	}

}
