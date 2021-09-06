package by.khmara.la.controller.impl;

import by.khmara.la.controller.Command;
import by.khmara.la.controller.CommandProvider;
import by.khmara.la.controller.Controller;

public class WarehouseController implements Controller {
	private CommandProvider commandProvider = new CommandProvider();

	@Override
	public String doAction(String request) {
		String[] params;
		String commandName;

		params = request.split("\s+");
		commandName = params[0];

		Command command = commandProvider.getCommand(commandName);
		String response;
		
		response = command.execute(params);

		return response;
	}

}
