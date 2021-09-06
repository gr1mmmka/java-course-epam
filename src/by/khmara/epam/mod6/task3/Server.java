package by.khmara.epam.mod6.task3;

import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Path;

import by.khmara.epam.mod6.task3.entity.Student;
import by.khmara.epam.mod6.task3.parser.DomParser;

/*
 * Задание 3: создайте клиент-серверное приложение “Архив”. 
 * Общие требования к заданию: 
 * • В архиве хранятся Дела (например, студентов). Архив находится на
 * сервере. 
 * • Клиент, в зависимости от прав, может запросить дело на просмотр,
 * внести в него изменения, или создать новое дело. 
 * 
 * Требования к коду лабораторной работы: 
 * • Для реализации сетевого соединения используйте сокеты.
 * • Формат хранения данных на сервере – xml-файлы.
 */

public class Server {
	
	private static final File PATH = Path
			.of("src", "by", "khmara", "epam", "mod6", "task3", "test", "resources", "students.xml").toFile();

	public static void main(String[] args) {

		try (var serverSocket = new ServerSocket(8888);
				var socket = serverSocket.accept();
				var output = new DataOutputStream(socket.getOutputStream());
				var input = new DataInputStream(socket.getInputStream())) {

			launch(output, input);

		} catch (Exception e) {
			System.out.println("server stopped.");
		}

	}

	private static void launch(DataOutput output, DataInput input) throws IOException {

		output.writeUTF(
				"Choose one of the following options: \n1. View all students\n2. Add student\n3. Edit student's information \n\n Type STOP to end");

		var request = input.readUTF();
		while (true) {

			if (request.equals("1")) {
				getStudents(output, input);
			} else if (request.equals("2")) {

				if (isAdmin(output, input)) {
					addStudent(output, input);
				} else {
					System.out.println("Not enough permission....");
					launch(output, input);
				}
			} else if (request.equals("3")) {
				if (isAdmin(output, input)) {
					editStudent(output, input);
				} else {
					System.out.println("Not enough permission....");
					launch(output, input);
				}
			}

			request = input.readUTF();
		}
	}

	private static void getStudents(DataOutput output, DataInput input) throws IOException {
		StringBuilder studentsList = new StringBuilder();

		for (int i = 0; i < DomParser.getStudents(PATH).size(); i++) {
			studentsList.append("id=" + (i + 1) + ": ");
			studentsList.append(DomParser.getStudents(PATH).get(i));
			studentsList.append("\n");
		}
		output.writeUTF(studentsList.toString());
	}

	private static void addStudent(DataOutput output, DataInput input) throws IOException {
		Student student = null;

		output.writeUTF("Name: ");
		String name = input.readUTF();
		output.writeUTF("Age: ");
		int age = Integer.parseInt(input.readUTF());
		output.writeUTF("Group: ");
		String group = input.readUTF();

		student = new Student((DomParser.getStudents(PATH).size() + 1), name, age, group);
		DomParser.addStudent(student, PATH);

		output.writeUTF("New student successfully added.");
	}

	private static void editStudent(DataOutput output, DataInput input) throws IOException {
		output.writeUTF("Type id of the student: ");
		int id = Integer.parseInt(input.readUTF());
		Student student = null;

		for (int i = 0; i < DomParser.getStudents(PATH).size(); i++) {
			if (DomParser.getStudents(PATH).get(i).getId() == id) {
				student = DomParser.getStudents(PATH).get(i);
			}
		}

		output.writeUTF("Current student: " + student.toString() + "\n\nNEW name: ");
		String name = input.readUTF();
		output.writeUTF("NEW age: ");
		int age = Integer.parseInt(input.readUTF());
		output.writeUTF("NEW group: ");
		String group = input.readUTF();

		DomParser.editStudent(id, new Student(id, name, age, group), PATH);

		output.writeUTF("Student's info edited.");
	}

	private static boolean isAdmin(DataOutput output, DataInput input) throws IOException {
		String password = "111";
		output.writeUTF("Enter the password to change information: ");

		return password.equals(input.readUTF()) ? true : false;
	}
}
