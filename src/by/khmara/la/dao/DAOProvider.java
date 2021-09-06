package by.khmara.la.dao;

import by.khmara.la.dao.impl.SQLUserDAO;
import by.khmara.la.dao.impl.SQLWarehouseDAO;

public class DAOProvider {

	private UserDAO userDAO = new SQLUserDAO();
	private WarehouseDAO warehouseDAO = new SQLWarehouseDAO();
	private static final DAOProvider INSTANCE = new DAOProvider();

	private DAOProvider() {

	}

	public static DAOProvider getInstance() {
		return INSTANCE;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public WarehouseDAO getWarehouseDAO() {
		return warehouseDAO;
	}

	public void setWarehouseDAO(WarehouseDAO warehouseDAO) {
		this.warehouseDAO = warehouseDAO;
	}

}
