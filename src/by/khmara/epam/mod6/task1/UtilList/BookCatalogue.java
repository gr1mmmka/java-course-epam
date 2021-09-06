package by.khmara.epam.mod6.task1.UtilList;

import java.io.File;
import java.nio.file.Path;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import by.khmara.epam.mod6.task1.bean.Book;
import by.khmara.epam.mod6.task1.bean.ElectronicBook;

public class BookCatalogue {
	private static List<Book> books = new ArrayList<>();

	private static List<Book> getBookList() {
		File file = Path.of("src", "by", "khmara", "epam", "mod6", "task1", "resources", "books.txt").toFile();

		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();

				if (line.split("-").length == 3) {
					scanner.useDelimiter(Pattern.compile("-\\s*"));

					String name = line.split("-")[0];
					String author = line.split("-")[1];
					Year ageOfPubliching = Year.parse(line.split("-")[2]);

					books.add(new Book(name, author, ageOfPubliching));
				} else {
					scanner.useDelimiter(Pattern.compile("-\\s*"));

					String name = line.split("-")[0];
					String author = line.split("-")[1];
					Year ageOfPubliching = Year.parse(line.split("-")[2]);
					String source = line.split("-")[3];

					books.add(new ElectronicBook(name, author, ageOfPubliching, source));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	public static List<Book> getBooks() {
		getBookList();
		return books;
	}

}
