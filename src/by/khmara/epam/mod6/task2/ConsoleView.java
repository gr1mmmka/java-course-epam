package by.khmara.epam.mod6.task2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleView {
	private Notepad notepad = new Notepad();
	private Scanner sc = new Scanner(System.in);

	public void start() {
		mainMenu();
	}

	private void mainMenu() {
		System.out.println("Please choose one of the following options: ");
		System.out.println("\n1.View all notes in the notepad\n2.Search notes\n3.Add note\n4.Close notepad");
		int choice;

		while (!sc.hasNext("[1-5]")) {
			sc.nextInt();
		}

		choice = sc.nextInt();

		switch (choice) {

		case (1):
			viewAllNotes();
			backToMainMenu();
			break;
		case (2):
			searchMenu();
			break;
		case (3):
			addNote();
			backToMainMenu();
			break;
		case (4):
			closeNotepad();
			break;
		}

	}

	private void viewAllNotes() {
		notepad.getNotes().stream().forEach(System.out::println);
	}

	private void searchMenu() {
		int choice;

		System.out.println("Please choose one of the following options: ");
		System.out.println("\n1.Search note by topic\n2.Search note by date"
				+ "\n3.Search note by email\n4.Search notte by date and topic\n5.Search note by word in the text");

		while (!sc.hasNext("[1-5]")) {
			sc.nextInt();
		}

		choice = sc.nextInt();

		switch (choice) {

		case (1):
			String topic;

			System.out.println("Enter the topic from list: " + Arrays.toString(Topic.values()));

			while (!sc.hasNext("[a-zA-Z]+")) {
				sc.next();
				System.out.println("Illegal characters, try again: ");
			}

			topic = sc.next();
			notepad.findByTopic(Topic.valueOf(topic.toUpperCase())).stream().forEach(System.out::println);

			backToSearchMenu();
			break;
		case (2):
			String date;

			System.out.println("Enter the date in the folowing format (yyyy-mm-dd): ");

			while (!sc.hasNext("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
				sc.next();
				System.out.println("Illegal characters, try again: ");
			}

			date = sc.next();
			notepad.findByDate(LocalDate.parse(date)).stream().forEach(System.out::println);
			backToSearchMenu();
			break;
		case (3):
			String email;

			System.out.println("Enter your email: ");

			while (!sc.hasNext(".+@{1}[a-z]{2,}\\.[a-z]{2,4}")) {
				sc.next();
				System.out.println("Illegal characters, try again: ");
			}

			email = sc.next();
			notepad.findByEmail(email).stream().forEach(System.out::println);

			backToSearchMenu();
			break;
		case (4):
			System.out.println("Enter the date in the folowing format (yyyy-mm-dd): ");

			while (!sc.hasNext("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
				sc.next();
				System.out.println("Illegal characters, try again: ");
			}
			date = sc.next();

			System.out.println("Enter the topic from list: " + Arrays.toString(Topic.values()));

			while (!sc.hasNext("[a-zA-Z]+")) {
				sc.next();
				System.out.println("Illegal characters, try again: ");
			}
			topic = sc.next().toUpperCase();

			try {
				notepad.findByDate(LocalDate.parse(date)).stream()
						.filter(s -> s.getTopic().equals(Topic.valueOf(topic))).forEach(System.out::println);
			} catch (Exception e) {
				e.printStackTrace();
			}

			backToSearchMenu();
			break;
		case (5):
			String word;

			System.out.println("Enter the word: ");

			while (!sc.hasNext("[a-zA-Z]+")) {
				sc.next();
				System.out.println("Illegal characters, try again: ");
			}

			word = sc.next();
			notepad.findByWordInText(word, notepad.getNotes()).stream().forEach(System.out::println);

			backToSearchMenu();
			break;
		}
	}

	private void addNote() {
		System.out.println("Enter the name of topic from folowing:" + Arrays.toString(Topic.values()));
		String topic;
		while (!sc.hasNext("[a-zA-Z]+")) {
			sc.next();
			System.out.println("Illegal characters, try again: ");
		}
		topic = sc.next().toUpperCase();

		String email;
		System.out.println("Enter your email: ");
		while (!sc.hasNext(".+@{1}[a-z]{2,}\\.[a-z]{2,4}")) {
			sc.next();
			System.out.println("Illegal characters, try again: ");
		}
		email = sc.next();

		String text;
		System.out.println("Type the text: ");
		
		sc.nextLine();
		text = sc.nextLine();

		try {
			notepad.addNote(Topic.valueOf(topic), LocalDate.now(), email, text);
			System.out.println("Note successfully added!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void closeNotepad() {
		sc.close();
		notepad.writeObjects(Notepad.getPath());
	}

	private void backToMainMenu() {
		System.out.println("\n1.Back to the main menu\n2.Close notepad");
		int choice;

		while (!sc.hasNext("[1-2]")) {
			sc.nextInt();
		}

		choice = sc.nextInt();

		switch (choice) {
		case (1):
			mainMenu();
			break;
		case (2):
			closeNotepad();
			break;
		}

	}

	private void backToSearchMenu() {
		System.out.println("\n1.Back to the search menu\n2.Close notepad");
		int choice;

		while (!sc.hasNext("[1-2]")) {
			sc.next();
		}

		choice = sc.nextInt();

		switch (choice) {
		case (1):
			searchMenu();
			break;
		case (2):
			closeNotepad();
			break;
		}
	}

}
