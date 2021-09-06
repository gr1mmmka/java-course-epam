package by.khmara.epam.mod4.task14;

public class Client {
	private String name;
	private AccountList accounts;

	public Client(String name, AccountList accounts) {

		this.name = name;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public AccountList getAccounts() {
		return accounts;
	}

}
