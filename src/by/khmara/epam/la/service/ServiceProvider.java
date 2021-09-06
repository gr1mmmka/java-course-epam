package by.khmara.epam.la.service;

import by.khmara.epam.la.service.impl.ServiceTreasureImpl;

public class ServiceProvider {
	private final ServiceTreasure serviceTreasure = new ServiceTreasureImpl();
	private static final ServiceProvider INSTANCE = new ServiceProvider();

	private ServiceProvider() {

	}

	public ServiceTreasure getServiceTreasure() {
		return serviceTreasure;
	}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}

}
