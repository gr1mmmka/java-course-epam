package by.khmara.la.service.impl;

import by.khmara.la.dao.DAOProvider;
import by.khmara.la.dao.UserDAO;
import by.khmara.la.service.UserService;

public class UserServiceImpl implements UserService {

	private final DAOProvider provider = DAOProvider.getInstance();
	
	@Override
	public boolean logination(String login, String password) {
		// validation
		
		UserDAO userDAO = provider.getUserDAO();
		userDAO.authorization(login, password);
		
		return false;
	}

}
