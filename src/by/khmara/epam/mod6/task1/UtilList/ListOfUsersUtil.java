package by.khmara.epam.mod6.task1.UtilList;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import by.khmara.epam.mod6.task1.bean.User;
import by.khmara.epam.mod6.task1.bean.UserRole;

public class ListOfUsersUtil {
	private static ArrayList<User> users = new ArrayList<>();

	private static ArrayList<User> getUserList() {
		File file = Path.of("src", "by", "khmara", "epam", "mod6", "task1", "resources", "users.txt").toFile();

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()) {
				String login = scanner.next();
				String password = scanner.next();
				String email = scanner.next();
				UserRole role = UserRole.valueOf(scanner.next().toUpperCase());
				users.add(new User(login, password, email, role));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public static ArrayList<User> getUsers() {
		return getUserList();
	}

}
