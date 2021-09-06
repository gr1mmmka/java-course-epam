package by.khmara.epam.mod4.task3;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 */

public class Runner {

	public static void main(String[] args) {

		Student[] s = new Student[] { new Student("Ivanov I.I.", 1, new int[] { 8, 9, 10, 1, 5 }),
				new Student("Petrov P.P.", 1, new int[] { 5, 8, 8, 8, 10 }),
				new Student("Antonov A.A.", 2, new int[] { 9, 9, 10, 9, 10 }),
				new Student("Svetikova S.S.", 2, new int[] { 6, 6, 7, 8, 10 }),
				new Student("Nosov N.N.", 2, new int[] { 4, 4, 4, 10, 10 }),
				new Student("Lobanov L.L.", 3, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Putin P.P.", 1, new int[] { 9, 9, 9, 9, 9 }),
				new Student("Smirnov S.S.", 1, new int[] { 4, 10, 5, 6, 7, 8 }),
				new Student("Samsonov S.S.", 1, new int[] { 9, 8, 8, 8, 10 }),
				new Student("Luka L.L.", 1, new int[] { 10, 8, 5, 8, 10 }) };

		printExcellentStudents(s);

	}

	public static void printExcellentStudents(Student[] s) {

		for (int i = 0; i < s.length; i++) {
			int countOfNegativeMarks = 0;
			for (int j = 0; j < s[i].getMarks().length; j++) {

				if (s[i].getMarks()[j] < 9) {
					countOfNegativeMarks++;
				}
			}
			if (countOfNegativeMarks == 0) {
				System.out.println(s[i]);
			}
		}
	}

}
