package by.khmara.epam.la.main;

import java.util.Scanner;

import by.khmara.epam.la.controller.ControllerProvider;
import by.khmara.epam.la.controller.impl.TreasureController;
import by.khmara.epam.la.presentation.Menu;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = null;

		Menu.startMenu();

		int choice = -1;
		while (choice != 4) {

			sc = new Scanner(System.in);

			while (!sc.hasNext("[0-9]")) {
				sc.next();
			}
			choice = sc.nextInt();

			ControllerProvider controllerProvider = ControllerProvider.getInstance();
			TreasureController treasureController = controllerProvider.getTreasureController();

			String response = treasureController.doAction(choice);

			System.out.println(response);
			Menu.backMenu();
		}

		if (choice == 0) {
			sc.close();
		}
	}
}
