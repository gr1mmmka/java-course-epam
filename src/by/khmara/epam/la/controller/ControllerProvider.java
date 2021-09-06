package by.khmara.epam.la.controller;

import by.khmara.epam.la.controller.impl.TreasureController;

public class ControllerProvider {

	private final TreasureController treasureController = new TreasureController();
	private static final ControllerProvider INSTANCE = new ControllerProvider();

	private ControllerProvider() {

	}

	public TreasureController getTreasureController() {
		return treasureController;
	}

	public static ControllerProvider getInstance() {
		return INSTANCE;
	}

}
