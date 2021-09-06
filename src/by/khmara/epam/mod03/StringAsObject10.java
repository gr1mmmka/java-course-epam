package by.khmara.epam.mod03;

/*
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. 
 * Определить количество предложений в строке X.
 */

public class StringAsObject10 {

	public static void main(String[] args) {

		String test;

		test = "Hello world, my name is Anton. And i fond of java! And what about you?";

		String[] mass = test.split("[.!?]");

		System.out.print(mass.length);

	}

}
