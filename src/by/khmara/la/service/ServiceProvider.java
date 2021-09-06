package by.khmara.la.service;

import by.khmara.la.service.impl.UserServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider INSTANCE = new ServiceProvider();
	private final UserService userService = new UserServiceImpl();
	
	private ServiceProvider() {
		
	}

	public static ServiceProvider getServiceProvider() {
		return INSTANCE;
	}
	
	public UserService getUserService() {
		return userService;
	}
}	
