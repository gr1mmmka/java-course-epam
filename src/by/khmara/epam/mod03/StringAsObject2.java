package by.khmara.epam.mod03;

import java.util.ArrayList;

/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class StringAsObject2 {

	public static void main(String[] args) {

		String sentence;
		char[] massOfChars;
		ArrayList<Character> listOfChars;

		listOfChars = new ArrayList<Character>();
		sentence = "My name is anton and last name is khmara";
		massOfChars = sentence.toCharArray();

		// create arrayList of chars of sentence

		for (int k = 0; k < massOfChars.length; k++) {

			listOfChars.add(massOfChars[k]);
		}

		// inset 'b' after 'a'

		for (int i = 0; i < listOfChars.size(); i++) {

			if (listOfChars.get(i) == 'a') {

				listOfChars.add(i + 1, 'b');
			}
		}

		StringBuilder str = new StringBuilder();

		for (int j = 0; j < listOfChars.size(); j++) {

			str.append(listOfChars.get(j));
		}

		System.out.println(str);

	}

}
