package by.khmara.epam.la.controller.impl;

import by.khmara.epam.la.controller.Command;
import by.khmara.epam.la.controller.CommandProvider;
import by.khmara.epam.la.controller.Controller;

public class TreasureController implements Controller {

	@Override
	public String doAction(Integer request) {

		Command command = CommandProvider.getInstance().getCommand(request);

		return command.execute();
	}

}
