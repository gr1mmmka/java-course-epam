package by.khmara.epam.la.controller.impl;

import by.khmara.epam.la.controller.Command;

public class NoSuchCommand implements Command {

	@Override
	public String execute() {
		
		return "This command does not exist, Try again....";
	}

}
