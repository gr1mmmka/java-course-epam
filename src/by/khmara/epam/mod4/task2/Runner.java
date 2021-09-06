package by.khmara.epam.mod4.task2;

/*
 * Создайте класс Test2 c двумя переменными. Добавьте конструктор с входными
 * параметрами. Добавьте конструктор, инициализирующий члены класса по
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Runner {

	public static void main(String[] args) {

		Test2 test = new Test2();
		System.out.println("X=" + test.getX() + "; Y=" + test.getY());

		Test2 test2 = new Test2(12, 10);
		System.out.println("X=" + test2.getX() + "; Y=" + test2.getY());

	}

}
