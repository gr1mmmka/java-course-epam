package by.khmara.la.controller;

import by.khmara.la.controller.impl.WarehouseController;

public class ControllerProvider {

	private static final ControllerProvider INSTANCE = new ControllerProvider();
	private final Controller warehouseController = new WarehouseController();

	private ControllerProvider() {

	}

	public static ControllerProvider getInstance() {
		return INSTANCE;
	}

	public Controller getWarehouseController() {
		return warehouseController;
	}

}
