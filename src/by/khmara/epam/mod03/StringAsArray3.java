package by.khmara.epam.mod03;

/*
 * 3. В строке найти количество цифр.
 */

public class StringAsArray3 {

	public static void main(String[] args) {

		String testString;
		char[] massOfChars;
		int countOfDigit = 0;

		testString = "_1hd18uh911oo21kc 2do10jof1";
		massOfChars = testString.toCharArray();

		for (int i = 0; i < massOfChars.length; i++) {

			if (Character.isDigit(massOfChars[i])) {
				countOfDigit++;
			}
		}

		System.out.print(countOfDigit);

	}

}
