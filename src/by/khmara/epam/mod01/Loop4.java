package by.khmara.epam.mod01;
public class Loop4 {

	/*
	 * 4. Найти произведение квадратов от 1 до 200
	 */

	public static void main(String[] args) {

		double sumSqr = 1;
		for (int i = 1; i <= 200; i++) {
			sumSqr *= Math.pow(i, 2);
		}
		System.out.println("Произведение первых двухста числе равна " + sumSqr);
	}
}