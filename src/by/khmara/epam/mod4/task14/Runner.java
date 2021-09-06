package by.khmara.epam.mod4.task14;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по всем счета, имеющим положительный и отрицательный
 * балансы отдельно.
 */

public class Runner {

	public static void main(String[] args) {

		AccountList accountsClient1 = new AccountList();

		Account accountByn = new Account(1, 421.42, "BYN", false);
		Account accountUsd = new Account(2, 51.21, "USD", false);
		accountsClient1.add(accountUsd);
		accountsClient1.add(accountByn);

		Client client1 = new Client("Ivanov I.I.", accountsClient1);

		AccountList accountsClient2 = new AccountList();

		Account account2Rub = new Account(1, 10_000, "RUB", false);
		Account account2Usd = new Account(2, 10, "USD", false);
		accountsClient2.add(account2Rub);
		accountsClient2.add(account2Usd);

		Client client2 = new Client("Petrov P.P.", accountsClient2);

		accountsClient2.getTotalPositiveSum();

	}

}
