package by.khmara.epam.mod02;

public class Decomposition11 {

	/*
	 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше
	 * цифр.
	 */

	public static void main(String[] args) {
		
		int numberOne = 1201;
		int numberTwo = 210;

		System.out.print(isBigger(numberOne, numberTwo));

	}

	public static String isBigger(long a, long b) {

		String str1;
		String str2;

		str1 = a + "";
		str2 = b + "";

		if (str1.length() > str2.length()) {
			return "Length of FIRST number is bigger";
		} else if (str1.length() < str2.length()) {
			return "Length of SECOND number is bigger";
		} else {
			return "Length of SECOND and FIRST numbers are equal";
		}

	}

}
