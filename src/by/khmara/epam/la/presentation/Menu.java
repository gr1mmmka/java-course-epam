package by.khmara.epam.la.presentation;

public class Menu {
	
	public static void startMenu() {
		StringBuilder sb = new StringBuilder();

		sb.append("Welcome to my Cave! Choose what do you want to do: ").append("\n").append("\n");
		sb.append("1. View all treasures").append("\n").append("2. Get the most expensive treasure")
		.append("\n").append("3. Find treasures by price").append("\n").append("4. Exit").append("\n")
		.append("\n").append("Type 1, 2, 3 or 4...");

		System.out.println(sb.toString());
	}
	
	public static void backMenu() {
		StringBuilder sb = new StringBuilder();

		sb.append("1. View all treasures").append("\n").append("2. Get the most expensive treasure")
		.append("\n").append("3. Find treasures by price").append("\n").append("4. Exit").append("\n")
		.append("\n").append("Type 1, 2, 3 or 4...");

		System.out.println(sb.toString());
	}
}
