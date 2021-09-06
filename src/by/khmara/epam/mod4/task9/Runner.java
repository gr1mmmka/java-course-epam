package by.khmara.epam.mod4.task9;

import java.time.Year;

public class Runner {

	public static void main(String[] args) {

		BookList books = new BookList();

		books.addBook(new Book(21, "War And Peace", new String[] { "Lev Tolstoy" }, "abc Publ.", Year.of(1820), 891,
				20.50, Wrapper.SPIRAL));
		books.addBook(new Book(10, "Idiot", new String[] { "Fedor Dostoevski" }, "xyz Publ.", Year.of(1845), 241,
				15.0, Wrapper.PERFECT));
		books.addBook(new Book(54, "Evgeniy Onegin", new String[] { "Pushkin Aleksandr" }, "Piter Publ.", Year.of(1805), 344,
				24.99, Wrapper.CASE));
		books.addBook(new Book(1, "Romeo And Julie", new String[] { "Shekspier" }, "London Publ.", Year.of(1590), 90,
				10.90, Wrapper.SPIRAL));
		books.addBook(new Book(412, "Head First", new String[] { "Katty Pery" }, "java Publ.", Year.of(2004), 547,
				25.99, Wrapper.SPIRAL));
		books.addBook(new Book(951, "Philosophy of Java", new String[] { "Brus Ekkel" }, "java Publ.", Year.of(1990), 791,
				30.99, Wrapper.COMB));
		
		books.printByYear(Year.of(1990));
	}

}
