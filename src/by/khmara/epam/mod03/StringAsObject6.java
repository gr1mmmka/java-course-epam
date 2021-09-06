package by.khmara.epam.mod03;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class StringAsObject6 {

	public static void main(String[] args) {

		String s;
		StringBuilder str;

		s = "hello world";
		str = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				str.append(s.charAt(i));
				continue;
			}

			str.append(s.charAt(i));
			str.append(s.charAt(i));
		}

		System.out.println(str);

	}

}
