package by.khmara.epam.mod03;

/*
 * 4. В строке найти количество чисел.
 */

public class StringAsArray4 {

	public static void main(String[] args) {

		String testString;
		char[] massOfChars;
		int countOfDigit = 0;

		testString = "_1hd18uh911oo21kc 2do10jofh189h230u1029rjoiqwd1283rgy1923f1";
		massOfChars = testString.toCharArray();

		for (int i = 0; i < massOfChars.length - 1; i++) {

			if (Character.isDigit(massOfChars[i])
					&& Character.isDigit(massOfChars[i + 1])) {
				i++;
				countOfDigit++;

				for (int j = i + 1; j < massOfChars.length; j++) {

					if (Character.isDigit(massOfChars[j])) {

						i++;
					} else {

						break;
					}
				}

			}

		}

		System.out.print(countOfDigit);
	}
}
