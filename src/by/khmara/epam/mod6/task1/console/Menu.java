package by.khmara.epam.mod6.task1.console;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import by.khmara.epam.mod6.task1.UtilList.BookCatalogue;
import by.khmara.epam.mod6.task1.bean.Book;
import by.khmara.epam.mod6.task1.bean.User;

public class Menu {

	public void launchStartMenu() {
		System.out.println("Welcome to my home library");
		System.out.print("\n1.View all list of books\n2.Search book by name"
				+ "\n3.Search book by author\n\n4.Exit from library\n\nType 1,2,3 or 4: ");
		String choice;

		choice = UserInput.choice(Pattern.compile("[1-4]"));

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
			break;
		}

	}

	protected void getListOfBooks() {
		Scanner scanner = new Scanner(System.in);

		List<Book> list = BookCatalogue.getBooks();
		Map<Integer, List<Book>> pages = new HashMap<>();

		for (int i = 0, j = 0; i < Math.ceil(list.size() / 2.0); i++, j += 2) {

			if (j == list.size() - 1) {
				pages.put(i + 1, List.of(list.get(j)));
			} else {
				pages.put(i + 1, list.subList(j, j + 2));
			}
		}

		System.out.println("\nPages in the catalagou: " + pages.size());

		System.out.print("\nType the number of page you want to view: ");
		while (!scanner.hasNext(Pattern.compile("\\d*"))) {
			scanner.nextInt();
		}

		Integer numberOfPage;
		do {
			numberOfPage = scanner.nextInt();

			if (pages.containsKey(numberOfPage)) {
				System.out.println("");
				pages.get(numberOfPage).stream().forEach(System.out::println);

				System.out.println("\nType another available page or 0 to back to menu...");

			} else if (numberOfPage == 0) {
				launchStartMenu();
			} else {
				System.out.println("There is no page " + numberOfPage);
			}
		} while (numberOfPage != 0);
	}

	protected void searchBookByName() {
		System.out.print("Type the name of the book... ");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();

		List<Book> book = BookCatalogue.getBooks().stream().filter(s -> s.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());

		if (book.size() > 0) {
			System.out.println(book);
		} else
			System.out.println("There are not books with the name " + name + " in the library :(");
	}

	protected void searchBookByAuthor() {
		System.out.print("Type the author of the book... ");
		Scanner scanner = new Scanner(System.in);

		String author = scanner.nextLine().toLowerCase();

		List<Book> book = BookCatalogue.getBooks().stream().filter(s -> s.getAuthor().toLowerCase().contains(author))
				.collect(Collectors.toList());

		if (book.size() > 0) {

			for (Book b : book) {
				System.out.println(b);
			}

		} else
			System.out.println("There are not books by " + author + " in the library :(");
	}

}
