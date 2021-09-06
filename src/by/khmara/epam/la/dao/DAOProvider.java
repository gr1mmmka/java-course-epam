package by.khmara.epam.la.dao;

import by.khmara.epam.la.dao.impl.SQLTreasureDAO;

public class DAOProvider {
	private final DAOTreasure sqlTreasureDAO = new SQLTreasureDAO();
	private static final DAOProvider INSTANCE = new DAOProvider();

	private DAOProvider() {

	}

	public DAOTreasure getSqlTreasureDAO() {
		return sqlTreasureDAO;
	}

	public static DAOProvider getInstance() {
		return INSTANCE;
	}

}
