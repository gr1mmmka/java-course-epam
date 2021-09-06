package by.khmara.epam.mod03;

/*
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class StringAsObject1 {

	public static void main(String[] args) {

		String sentence;
		int countOfSpaces;
		int max;
		char[] massOfChars;

		max = 0;
		sentence = "  hello    my dear  friend";
		massOfChars = sentence.toCharArray();

		for (int i = 0; i < massOfChars.length; i++) {

			countOfSpaces = 0;

			while (Character.isWhitespace(massOfChars[i])) {

				countOfSpaces++;
				i++;
			}

			if (countOfSpaces > max) {

				max = countOfSpaces;
			}
		}

		System.out.print(max);

	}

}
