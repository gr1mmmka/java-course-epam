package by.khmara.epam.mod4.task8;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 *    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 *    номер банковского счета.
 *    Найти и вывести:
 *    a) список покупателей в алфавитном порядке;
 *    b) список покупателей, у которых номер кредитной карточки находится
 *    в заданном интервале.
 */

public class Runner {

	public static void main(String[] args) {

		CustomerList customers = new CustomerList();
		customers.addCustomer(
				new Customer(3, "Petrov", "Petr", "Aleksandrovich", new Customer.Address(), 542, 412421412));
		customers.addCustomer(new Customer(1, "Ivanov", "Maksim", "Ivanovich", new Customer.Address(), 001, 84534021));
		customers
				.addCustomer(new Customer(5, "Svetikova", "Sveta", "Maksimovna", new Customer.Address(), 111, 5862243));
		customers.addCustomer(
				new Customer(2, "Antonov", "Igor", "Anatolyevich", new Customer.Address(), 212, 124105193));
		customers.addCustomer(new Customer(4, "Filonov", "Artur", "Sergeevich", new Customer.Address(), 999, 32583985));

		customers.printCustomersByName();

	}

}
