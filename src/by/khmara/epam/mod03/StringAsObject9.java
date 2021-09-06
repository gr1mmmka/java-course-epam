package by.khmara.epam.mod03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
 * Учитывать только английские буквы.
 */

public class StringAsObject9 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		System.out.print("Count of low letters: " + countOfLowLetters(s)
				+ "\nCount of high letters: " + countOfHighLetters(s));

	}

	// count the LOW English letters in sentence

	public static int countOfLowLetters(String s) {
		int countOfLower = 0;

		for (int i = 0; i < s.length(); i++) {
			String str;
			str = s.charAt(i) + "";

			if (str.matches("[a-zA-Z]")) {

				if (s.charAt(i) == Character.toLowerCase(s.charAt(i))) {

					countOfLower++;
				}
			}
		}

		return countOfLower;
	}

	// count the HIGH English letters in sentence

	public static int countOfHighLetters(String s) {
		int countOfUpper = 0;

		for (int i = 0; i < s.length(); i++) {
			String str;
			str = s.charAt(i) + "";

			if (str.matches("[a-zA-Z]")) {

				if (s.charAt(i) != Character.toLowerCase(s.charAt(i))) {

					countOfUpper++;
				}
			}
		}

		return countOfUpper;
	}
}
