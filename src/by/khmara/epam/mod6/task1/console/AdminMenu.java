package by.khmara.epam.mod6.task1.console;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Year;
import java.util.Scanner;
import java.util.regex.Pattern;

import by.khmara.epam.mod6.task1.UtilList.BookCatalogue;
import by.khmara.epam.mod6.task1.bean.Book;

public class AdminMenu extends Menu {

	@Override
	public void launchStartMenu() {
		System.out.println("Welcome to my home library");
		System.out.println("\n1.View all list of books\n2.Search book by name"
				+ "\n3.Search book by author\n4.Add book to catalogue\n5.Exit from library\n\nType 1,2,3,4 or 5");
		String choice;

		choice = UserInput.choice(Pattern.compile("[1-5]"));

		switch (choice) {

		case ("1"):
			getListOfBooks();
			break;
		case ("2"):
			searchBookByName();
			break;
		case ("3"):
			searchBookByAuthor();
			break;
		case ("4"):
			addBook();
			break;
		case ("5"):
			break;
		}

	}

	private void addBook() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Type the name of the book: ");
		String name = scanner.nextLine();
		System.out.print("Type the author of the book: ");
		String author = scanner.nextLine();
		System.out.print("Type the year of publishing of the book: ");
		String ageOfPublishin = scanner.nextLine();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				Path.of("src", "by", "khmara", "epam", "mod6", "task1", "resources", "books.txt").toFile(), true))) {

			writer.write("\n" + name);
			writer.write("-");
			writer.write(author);
			writer.write("-");
			writer.write(ageOfPublishin);
			writer.write("-");

			System.out.println("Book added.");
			launchStartMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
