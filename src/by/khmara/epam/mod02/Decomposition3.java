package by.khmara.epam.mod02;

public class Decomposition3 {

	/*
	 * 3. Вычислить площадь правильного шестиугольника со стороной равной а,
	 * используя метод вычисления площади треугольника
	 */

	public static void main(String[] args) {

		System.out.println("Площадь 6-тиугольника со стороной 5 равна  - " + square(5));

	}

	public static double square(int a) {

		double square;

		square = 3 * Math.sqrt(3) * Math.pow(a, 2) / 2;

		return square;
	}

}
