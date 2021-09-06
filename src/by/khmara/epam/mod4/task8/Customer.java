package by.khmara.epam.mod4.task8;

public class Customer {

	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private Address address;
	private int creditCardNumber;
	private int bankAccount;

	public Customer(int id, String lastName, String firstName, String patronymic, Address address, int creditCardNumber,
			int bankAccount) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccount = bankAccount;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + "]";
	}

	public static class Address {
		private String country;
		private String city;
	}
}
