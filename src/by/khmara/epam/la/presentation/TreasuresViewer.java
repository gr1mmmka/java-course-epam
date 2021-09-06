package by.khmara.epam.la.presentation;

import java.util.Map;

import by.khmara.epam.la.bean.Treasure;

public class TreasuresViewer {

	public static String viewer(Map<Treasure, Integer> treasures) {

		StringBuilder sb = new StringBuilder();

		sb.append("All treasures in the Cave:").append("\n");

		for (Map.Entry<Treasure, Integer> t : treasures.entrySet()) {

			sb.append(t.getKey()).append(" - ").append(t.getValue()).append(" pieces.").append("\n");
		}

		return sb.toString();
	}
}
