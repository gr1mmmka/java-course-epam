package by.khmara.la.dao;

import by.khmara.la.bean.User;

public interface UserDAO {

	boolean authorization(String login, String password);
	
	boolean logination(User user);

}
