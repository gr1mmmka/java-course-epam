package by.khmara.epam.mod4.task7;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Runner {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(1, 2, 7);
		System.out.println(triangle1.getSquare());

		Triangle triangle2 = new Triangle(3, 5, 6);
		System.out.println(triangle2.getSquare());

	}

}
