package by.khmara.la.controller;

import java.util.HashMap;
import java.util.Map;

import by.khmara.la.controller.impl.LoginationCommand;
import by.khmara.la.controller.impl.RegistrationCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put("logination", new LoginationCommand());
		commands.put("registration", new RegistrationCommand());
	}

	public Command getCommand(String commandName) {

		Command command;
		command = commands.get(commandName);

		return command;
	}
}
