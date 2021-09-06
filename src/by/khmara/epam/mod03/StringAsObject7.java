package by.khmara.epam.mod03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class StringAsObject7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder str = new StringBuilder(br.readLine());

		deleteAllWhitespaces(str);
		deleteRepeatLetters(str);

		System.out.println(str);

	}

	// delete repeat letters

	public static String deleteRepeatLetters(StringBuilder s) {

		for (int i = 0; i < s.length(); i++) {

			for (int j = 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j) && i != j) {

					s.deleteCharAt(j);
				}

			}
		}

		return s.toString();

	}

	// delete all whitespaces

	public static String deleteAllWhitespaces(StringBuilder s) {

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {

				s.deleteCharAt(i);
			}
		}
		return s.toString();
	}
}
