package by.khmara.epam.la.controller;

import java.util.HashMap;
import java.util.Map;

import by.khmara.epam.la.controller.impl.FindByPriceCommand;
import by.khmara.epam.la.controller.impl.FindTreasureCommand;
import by.khmara.epam.la.controller.impl.NoSuchCommand;
import by.khmara.epam.la.controller.impl.ViewAllCommand;

public class CommandProvider {
	private Map<Integer, Command> commands = new HashMap<>();
	private static final CommandProvider INSTANCE = new CommandProvider();

	private CommandProvider() {
		commands.put(0, new NoSuchCommand());
		commands.put(1, new ViewAllCommand());
		commands.put(2, new FindTreasureCommand());
		commands.put(3, new FindByPriceCommand());
	}
	
	public Command getCommand(Integer commandIndex) {
		Command command = null;
		
		if (commands.containsKey(commandIndex)) {
			command = commands.get(commandIndex);
		} else {
			command = commands.get(0);
		}
		
		return command;
	}

	public static CommandProvider getInstance() {
		return INSTANCE;
	}

}
