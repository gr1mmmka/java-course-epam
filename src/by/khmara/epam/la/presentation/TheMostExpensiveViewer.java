package by.khmara.epam.la.presentation;

import by.khmara.epam.la.bean.Treasure;

public class TheMostExpensiveViewer {

	public static String viewer(Treasure treasure) {

		StringBuilder sb = new StringBuilder();

		sb.append("The most expensive treasure in the Cave:").append("\n");
		sb.append(treasure).append("\n");

		return sb.toString();
	}
}
