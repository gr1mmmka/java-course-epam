package by.khmara.epam.mod03;

/*
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class StringAsArray2 {

	public static void main(String args[]) {

		String sentenceWorld;
		String sentenceLetter;

		sentenceWorld = "helloworld, you are the most beutiful world";

		sentenceLetter = sentenceWorld.replace("world", "letter");
		
		System.out.print(sentenceLetter);
	}
}
