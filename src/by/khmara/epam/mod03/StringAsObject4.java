package by.khmara.epam.mod03;

/*
 * 4. С помощью функции копирования и операции конкатенации составить из частей
 * слова “информатика” слово “торт”
 */

public class StringAsObject4 {

	public static void main(String[] args) {

		String s1 = "информатика";

		System.out.println(toCake(s1));

	}

	public static StringBuilder toCake(String s) {

		StringBuilder str = new StringBuilder();

		str.append(s.charAt(s.indexOf('т')));
		str.append(s.charAt(s.indexOf('о')));
		str.append(s.charAt(s.indexOf('р')));
		str.append(s.charAt(s.indexOf('т')));

		return str;
	}

}
