package by.khmara.epam.la.presentation;

import java.util.List;

import by.khmara.epam.la.bean.Treasure;

public class FIndByPriceViewer {
	
	public static String viewer(List<Treasure> treasures, double price) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("For " + price + "$ you can buy next items: ");
		
		for (Treasure t : treasures) {
			sb.append(t);
			sb.append("\n");
		}
		
		return sb.toString();
	}

}
