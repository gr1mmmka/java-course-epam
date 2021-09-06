package by.khmara.epam.mod4.task9;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class BookList {
	private List<Book> books;

	public BookList() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}

	public void printByAuthor(String author) {
		for (int i = 0; i < books.size(); i++) {
			for (int j = 0; j < books.get(i).getAuthors().length; j++) {
				if (books.get(i).getAuthors()[j].equals(author)) {
					System.out.println(books.get(i));
				}
			}
		}
	}

	public void printByPublishing(String publishing) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublishing().equals(publishing)) {
				System.out.println(books.get(i));
			}
		}
	}

	public void printByYear(Year year) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getYear().isBefore(year)) {
				System.out.println(books.get(i));
			}
		}
	}
}
