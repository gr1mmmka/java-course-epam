package by.khmara.la.controller.impl;

import by.khmara.la.controller.Command;
import by.khmara.la.presentation.UserActionViewer;
import by.khmara.la.service.ServiceProvider;
import by.khmara.la.service.UserService;

public class LoginationCommand implements Command {

	@Override
	public String execute(String[] params) {
		
		String login;
		String password;

		login = params[1].split("=")[1];
		password = params[2].split("=")[1];

		UserService userService = ServiceProvider.getServiceProvider().getUserService();
		boolean result = userService.logination(login, password);

		return UserActionViewer.loginationAnswer(result);
	}

}
