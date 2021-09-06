package by.khmara.epam.mod6.task1.console;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInput {
	Pattern pattern;

	public static String choice() {
		String choice = null;

		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNext()) {
			scanner.next();
		}

		choice = scanner.next();

		return choice;
	}

	public static String choice(Pattern pattern) {
		String choice = null;

		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNext(pattern)) {
			scanner.next();
		}

		choice = scanner.next();

		return choice;
	}

}
