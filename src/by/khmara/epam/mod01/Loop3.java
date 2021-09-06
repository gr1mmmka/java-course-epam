package by.khmara.epam.mod01;
public class Loop3 {

	/*
	 * 3. Найти сумму квадратов первых 100 чисел
	 */

	public static void main(String[] args) {

		int sumSqr = 0;
		for (int i = 1; i <= 100; i++) {
			sumSqr += Math.pow(i, 2);
		}
		System.out.println("Сумма квадратов первых ста числе равна " + sumSqr);
	}
}