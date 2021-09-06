package by.khmara.epam.mod03;

/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */

import java.util.ArrayList;

public class StringAsArray1 {

	public static void main(String[] args) {

		String mass;
		char[] massOfChar;
		ArrayList<Character> c = new ArrayList<>();

		mass = "helloWorldItsMe";

		massOfChar = mass.toCharArray();

		for (int i = 0; i < massOfChar.length; i++) {

			c.add(massOfChar[i]);

		}

		for (int j = 0; j < c.size(); j++) {

			Character.toLowerCase(c.get(j));

			if (Character.isUpperCase(c.get(j))) {
				c.add(j, '_');
				j = j + 2;
			}
		}

		StringBuilder str = new StringBuilder();

		for (int k = 0; k < c.size(); k++) {
			str.append(Character.toLowerCase(c.get(k)));
		}

		System.out.println(str);
	}

}
