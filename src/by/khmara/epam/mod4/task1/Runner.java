package by.khmara.epam.mod4.task1;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 */

public class Runner {

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		test1.setX(17);

		test1.printVariables();

		System.out.println(test1.sumOfVariables());
		System.out.println(test1.maxOfVariables());

	}

}
