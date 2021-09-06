package by.khmara.epam.mod5.task5.bean;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
	private String name;
	private static List<Flower> range;

	public FlowerShop(String name) {
		addFlowers();
		this.name = name;

	}

	private void addFlowers() {
		range = new ArrayList<>();
		File file = Path.of("src", "by", "khmara", "epam", "mod5", "task5", "resources", "flowers.txt").toFile();
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				range.add(new Flower(sc.next(), sc.nextDouble()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public List<Flower> getRange() {
		return range;
	}

}
