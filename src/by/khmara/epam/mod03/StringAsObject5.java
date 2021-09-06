package by.khmara.epam.mod03;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква
 * “а”.
 */

public class StringAsObject5 {

	public static void main(String[] args) {

		int count;
		String s;

		count = 0;
		s = "hello my name is Anton Khmara";

		for (int i = 0; i < s.length(); i++) {

			if (s.toLowerCase().charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println(count);
	}

}
