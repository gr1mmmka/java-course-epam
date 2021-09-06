package by.khmara.epam.mod5.task4.action;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import by.khmara.epam.mod5.task4.bean.Archer;
import by.khmara.epam.mod5.task4.bean.Cave;
import by.khmara.epam.mod5.task4.bean.Hero;
import by.khmara.epam.mod5.task4.bean.Treasure;
import by.khmara.epam.mod5.task4.bean.Warrior;

public class GameLogic {

	private Cave cave = new Cave();
	private Hero hero;

	public void startGame() {
		System.out.println("Welcome to the game!\n \n1.Buy the treasures\n2.Take treasures by force\n"
				+ "3.Look all the treasures\n4.Get the most expensive treasure");
		System.out.println("\nChoose 1, 2, 3 or 4");

		try (Scanner sc = new Scanner(System.in)) {
			while (!sc.hasNextInt()) {
				sc.next();
			}

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				buyTreasures();
				break;
			case 2:
				takeByForce();
				break;
			case 3:
				lookAllTreasures();
				break;
			case 4:
				getTheMostExpensive();
				break;
			default:
				mainMenu();
			}
		} catch (Exception e) {
			System.out.println("Enter 1, 2, 3, 4 or 5");
			mainMenu();
		}
	}

	private void buyTreasures() {
		int money;
		int index = 0;
		Set<Treasure> unicTreasures;

		System.out.println("How much money do you have?");
		try (Scanner sc = new Scanner(System.in)) {
			money = sc.nextInt();
			unicTreasures = new HashSet<>(Cave.getTreasures());

			for (Treasure t : unicTreasures) {
				if (money >= t.getCost()) {
					int count = money / t.getCost();
					System.out.println("You can buy " + count + "x " + t.getName() + " for " + t.getCost() + "$");
					index++;
				}
			}
			if (index == 0) {
				System.out.println("Not enough money for any treasures :(");
			}
			mainMenu();
		}
	}

	private void takeByForce() {
		System.out.println("Choose a hero:\n1. Warrior\n2. Archer");
		System.out.println("Choose 1 or 2");

		try (Scanner sc = new Scanner(System.in)) {
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				hero = new Warrior("Warrior", 20);
				break;
			case 2:
				hero = new Archer("Archer", 10);
			}

			while (cave.getDragon().isALive()) {
				hero.atack(cave.getDragon());
			}

			System.out.println(
					"You beat the " + cave.getDragon().getName() + "\nNow you can take all the treasures in the cave");

			hero.setBag(Cave.getTreasures());

			mainMenu();
		}
	}

	private void lookAllTreasures() {
		for (Treasure t : Cave.getTreasures()) {
			System.out.println(t);
		}
		mainMenu();
	}

	private void getTheMostExpensive() {
		Optional<Treasure> t = Cave.getTreasures().stream().max(new TreasuresByCost());
		System.out.println("The most expensive treasure in the cave is " + t.get().getName());
		mainMenu();
	}

	private void mainMenu() {
		int choice;

		System.out.println("\n1.Buy the treasures\n2.Take treasures by force\n"
				+ "3.Look all the treasures\n4.Get the most expensive treasure\n5.End game");
		System.out.println("\nChoose 1, 2, 3, 4 or 5");

		try (Scanner scanner = new Scanner(System.in)) {
			while (!scanner.hasNextInt()) {
				scanner.next();
			}

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				buyTreasures();
				break;
			case 2:
				takeByForce();
				break;
			case 3:
				lookAllTreasures();
				break;
			case 4:
				getTheMostExpensive();
				break;
			case 5:
				break;
			}
		}
	}

	private static class TreasuresByCost implements Comparator<Treasure> {

		@Override
		public int compare(Treasure o1, Treasure o2) {
			return Integer.compare(o1.getCost(), o2.getCost());

		}

	}
}
