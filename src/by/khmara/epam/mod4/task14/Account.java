package by.khmara.epam.mod4.task14;

public class Account {
	private int id;
	private double sum;
	private String currency;
	private boolean isBlock;
	private boolean isPositiveBalance;

	public Account(int id, double sum, String currency, boolean isBlock) {

		this.id = id;
		this.sum = sum;
		this.currency = currency;
		this.isBlock = isBlock;

		if (sum > 0) {
			isPositiveBalance = true;
		}
	}

	public int getId() {
		return id;
	}

	public double getSum() {
		return sum;
	}

	public String getCurrency() {
		return currency;
	}

	public boolean isBlock() {
		return isBlock;
	}

	public boolean isPositiveBalance() {
		return isPositiveBalance;
	}

	public void setBlock(boolean isBlock) {
		this.isBlock = isBlock;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", sum=" + sum + ", currency=" + currency + "]";
	}

}
