package by.khmara.epam.mod6.task3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

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

public class Client {

	public static void main(String[] args) {

		try (var socket = new Socket("localhost", 8888);
				var output = new DataOutputStream(socket.getOutputStream());
				var input = new DataInputStream(socket.getInputStream());
				var scanner = new Scanner(System.in)) {

			System.out.println("Response from server: " + input.readUTF());

			while (scanner.hasNextLine()) {
				String request = scanner.nextLine();

				if (request.equalsIgnoreCase("stop"))
					break;

				output.writeUTF(request);

				System.out.println(input.readUTF());
			}

		} catch (Exception e) {
			System.out.println("Server shutdown :(");
		}

	}

}
