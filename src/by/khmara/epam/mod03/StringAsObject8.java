package by.khmara.epam.mod03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class StringAsObject8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder str = new StringBuilder(br.readLine());

		theLongestWord(str);

	}

	// print the longest word in the sentence
	// if there is two or more the longest words -> do nothing

	public static void theLongestWord(StringBuilder s) {
		int count = 0;
		int maxLength = 0;
		String max = null;
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			if (!(s.charAt(i) == ' ')) {

				temp.append(s.charAt(i));
				count++;

				if (i == s.length() - 1) {

					if (maxLength < count) {

						max = temp.toString();

					}
				}
			}

			if (maxLength == count) {
				max = "";
			}

			if (s.charAt(i) == ' ') {

				if (maxLength < count) {
					maxLength = count;
					max = temp.toString();

				}

				count = 0;
				temp.setLength(0);

			}
		}

		if (!max.isEmpty()) {

			System.out.println(max);
		}
	}
}
