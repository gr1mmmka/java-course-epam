package by.khmara.la.bean;

public class User {

	private String login;
	private String password;

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public User() {

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [login=" + login + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null) {
			return false;
		}

		if (getClass() != o.getClass()) {
			return false;
		}

		User user = (User) o;

		return login.equals(user.getLogin()) ? true : false;
	}

	@Override
	public int hashCode() {

		return 31 * login.hashCode();
	}

}
