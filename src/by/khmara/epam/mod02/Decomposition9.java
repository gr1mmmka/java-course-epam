package by.khmara.epam.mod02;

import static java.lang.Math.pow;

public class Decomposition9 {

	/*
	 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
	 * метод(методы) вычисления его площади, если угол между сторонами длиной X и Y—
	 * прямой.
	 */

	public static void main(String[] args) {

		System.out.print("Площадь четырехугольника равна = " + square(9, 8, 7, 15));

	}

	public static double square(int x, int y, int z, int t) {
		double h; // гипотенуза
		double p; // периметр / 2
		double squareOfFirstTriangle;
		double squareOfSecondTriangle;

		h = Math.sqrt(pow(x, 2) + pow(y, 2));
		p = (z + t + h) / 2;

		squareOfFirstTriangle = x * y / 2;
		squareOfSecondTriangle = Math.sqrt(p * (p - z) * (p - t) * (p - h));

		return squareOfFirstTriangle + squareOfSecondTriangle;
	}

}
