package by.khmara.epam.mod5.task4.bean;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Cave {
	private static ArrayList<Treasure> treasures;
	private Dragon dragon;

	public Cave() {
		treasures = listOfTreasures();
		dragon = new Dragon();
	}

	private static ArrayList<Treasure> listOfTreasures() {
		treasures = new ArrayList<>();
		File file = Path.of("src", "by", "khmara", "epam", "mod5", "task4", "resources", "treasures.txt").toFile();

		try (Scanner reader = new Scanner(new FileReader(file))) {

			while (reader.hasNext()) {

				treasures.add(new Treasure(reader.next(), reader.nextInt()));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return treasures;
	}

	public static ArrayList<Treasure> getTreasures() {
		return treasures;
	}

	public Dragon getDragon() {
		return dragon;
	}

}
