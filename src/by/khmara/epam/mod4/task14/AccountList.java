package by.khmara.epam.mod4.task14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccountList {
	private List<Account> accounts;

	private static final double EXCHANGE_RATE_USD = 2.5;
	private static final double EXCHANGE_RATE_EUR = 3.1;
	private static final double EXCHANGE_RATE_RUB = 0.35;

	public AccountList() {
		accounts = new ArrayList<>();
	}

	public void add(Account account) {
		accounts.add(account);
	}
	
	//блокировка и разблокировка счета
	
	public void blockAccount(Account account) {
		account.setBlock(true);
	}

	public void unblockAccount(Account account) {
		account.setBlock(false);
	}

	//ищет счет по номеру
	
	public void findAccountById(int id) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId() == id) {
				System.out.println(accounts.get(i));
			}
		}
	}

	// Находит общий баланс по счетам с положительным и отрицательным балансами отдельно
	
	public void getTotalPositiveSum() {
		double totalPositiveSum = 0;
		double totalNegativeSum = 0;

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).isPositiveBalance()) {

				switch (accounts.get(i).getCurrency()) {
				case "BYN":
					totalPositiveSum += accounts.get(i).getSum();
					break;
				case "RUB":
					totalPositiveSum += converterRubToByn(accounts.get(i).getSum());
					break;
				case "USD":
					totalPositiveSum += converterUsdToByn(accounts.get(i).getSum());
					break;
				case "EUR":
					totalPositiveSum += converterEurToByn(accounts.get(i).getSum());
					break;
				}
			} else {
				switch (accounts.get(i).getCurrency()) {
				case "BYN":
					totalNegativeSum += accounts.get(i).getSum();
					break;
				case "RUB":
					totalNegativeSum += converterRubToByn(accounts.get(i).getSum());
					break;
				case "USD":
					totalNegativeSum += converterUsdToByn(accounts.get(i).getSum());
					break;
				case "EUR":
					totalNegativeSum += converterEurToByn(accounts.get(i).getSum());
					break;
				}
			}
		}
		System.out.println("Total sum on accounts with positive balance - " + totalPositiveSum + "BYN");
		System.out.println("Total sum on accounts with negative balance - " + totalNegativeSum + "BYN");

	}

	//конверторы валют
	
	public double converterRubToByn(double sum) {
		return sum * EXCHANGE_RATE_RUB;
	}

	public double converterUsdToByn(double sum) {
		return sum * EXCHANGE_RATE_USD;
	}

	public double converterEurToByn(double sum) {
		return sum * EXCHANGE_RATE_EUR;
	}

	//сортирует счета по балансу
	
	public void sortAccountsBySum() {
		accounts.stream().sorted(new AccountComparator());

	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	class AccountComparator implements Comparator<Account> {

		@Override
		public int compare(Account o1, Account o2) {

			return Double.compare(o1.getSum(), o2.getSum());
		}

	}

}
