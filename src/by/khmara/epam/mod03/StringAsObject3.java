package by.khmara.epam.mod03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3. Проверить, является ли заданное слово палиндромом.
 */

public class StringAsObject3 {

	public static void main(String[] args) throws IOException {

		String s = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (!s.equals("close")) {

			StringBuilder str = new StringBuilder();
			StringBuilder strReverse = new StringBuilder();

			s = br.readLine();

			str.append(s);
			strReverse.append(s).reverse();

			// close program when you enter 'close'

			if (!s.equals("close")) {
				System.out
						.println(str.toString().equals(strReverse.toString()));
			}
		}
	}

}
