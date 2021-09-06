package by.khmara.epam.mod03;

import java.util.ArrayList;

/*
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class StringAsArray5 {

	public static void main(String[] args) {

		String testString;
		char[] massOfChars;
		ArrayList<Character> listOfChars;

		listOfChars = new ArrayList<Character>();
		testString = "          hello      world                            ";
		massOfChars = testString.toCharArray();

		System.out.println(testString);

		for (int k = 0; k < massOfChars.length; k++) {

			listOfChars.add(massOfChars[k]);
		}

		// delete extra whitespace except first and last spaces

		for (int i = 0; i < listOfChars.size() - 1; i++) {

			if (Character.isWhitespace(listOfChars.get(i)) && Character.isWhitespace(listOfChars.get(i + 1))) {

				listOfChars.remove(i);

				for (int j = i; j < listOfChars.size() - 1; j++) {

					if (Character.isWhitespace(listOfChars.get(i + 1))) {
						j--;
						listOfChars.remove(i + 1);
					} else {

						break;
					}
				}
			}
		}

		// delete first whitespace

		if (Character.isWhitespace(listOfChars.get(0))) {
			listOfChars.remove(0);
		}

		// delete last whitespace

		if (Character.isWhitespace(listOfChars.get(listOfChars.size() - 1))) {
			listOfChars.remove(listOfChars.size() - 1);
		}

		// create string from ArrayList

		StringBuilder str = new StringBuilder();

		for (int l = 0; l < listOfChars.size(); l++) {
			str.append(listOfChars.get(l));
		}

		System.out.println(str);
	}
}
