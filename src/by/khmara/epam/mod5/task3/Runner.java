package by.khmara.epam.mod5.task3;

/*
 * Создать класс Календарь с внутренним классом, с помощью объектов которого
 * можно хранить информацию о выходных и праздничных днях.
 */

public class Runner {

	public static void main(String[] args) {
		Calendar c = new Calendar(2021);
		System.out.println(c.getHolidays());

	}

}
