package by.khmara.epam.mod4.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerList {

	private List<Customer> customers;
	
	public CustomerList() {
		customers = new ArrayList<>();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void printCustomersByName() {
		Collections.sort(customers, new CustomerComparatorByName());
		System.out.println(customers);
	}

	public void printCustomersByCreditCard(int from, int to) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCreditCardNumber() >= from && customers.get(i).getCreditCardNumber() <= to) {
				System.out.println(customers.get(i));
			}
		}
	}

	private class CustomerComparatorByName implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			String firstName = o1.getLastName() + " " + o1.getFirstName();
			String secondName = o2.getLastName() + " " + o2.getFirstName();
			return firstName.compareTo(secondName);
		}

	}
}
