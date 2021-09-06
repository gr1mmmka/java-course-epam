package by.khmara.epam.mod6.task1.console;

import java.util.ArrayList;
import java.util.List;

import by.khmara.epam.mod6.task1.UtilList.ListOfUsersUtil;
import by.khmara.epam.mod6.task1.bean.User;
import by.khmara.epam.mod6.task1.bean.UserRole;

public class Authorization {
	private String login, password;
	private UserRole role;
	private List<User> users = new ArrayList<>();

	public void welcome() {
		System.out.print("Enter you login: ");

		login = UserInput.choice();
		System.out.print("And password: ");
		password = UserInput.choice();

		if (checkUser(login, password)) {
			System.out.println("\nGreetings " + login + "! You are logged in as " + role);

			if (role.equals(role.ADMIN)) {
				new AdminMenu().launchStartMenu();
			} else {
				new Menu().launchStartMenu();
			}
			
		} else {
			System.out.println("No such login or wrong password :(");
		}
	}

	private boolean checkUser(String login, String password) {
		boolean isExist = false;
		users = ListOfUsersUtil.getUsers();

		for (int i = 0; i < users.size(); i++) {
			if (login.equals(users.get(i).getLogin()) && password.equals(users.get(i).getPassword())) {
				role = users.get(i).getRole();
				isExist = true;
			}
		}

		return isExist;
	}

}
