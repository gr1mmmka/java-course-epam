package by.khmara.epam.mod5.task1;

import java.util.List;

/*
 * Создать объект Текстовый файл, используя классы Файл, Директория. Методы:
 * создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Runner {

	public static void main(String[] args) {

		Directory dir = new Directory(List.of("users", "anton", "homework"));

		TextFile textFile = new TextFile("Document", "txt", dir);
		dir.createFile(textFile);
		textFile.changeName("New Document");
		textFile.addContent("new text");
		textFile.printContent();
		dir.deleteFile(textFile);

		dir.createFile(new File("Bus Timetable", "docx", dir));

		System.out.println("\n" + dir.getFiles());

	}
}
