package by.khmara.epam.la.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import by.khmara.epam.la.dao.DAOTreasure;

public class SQLTreasureDAO implements DAOTreasure {
	private File file;
	private static final Path PATH = Path.of("src", "by", "khmara", "epam", "la", "resources", "treasures.txt");

	@Override
	public List<String> getTreasures() {
		file = PATH.toFile();
		List<String> treasures = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			treasures = reader.lines().collect(Collectors.toList());

		} catch (IOException e) {

			// create DAO exception
		}

		return treasures;
	}

}
