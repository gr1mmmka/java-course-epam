package by.khmara.epam.mod01;
public class Loop6 {

	/*
	 * 6. Вывести на экран таблицу соответсвий между символами и их
	 * числовыми значениями
	 */

	public static void main(String[] args) throws Exception {

		int index = 0;
		for (char c = 0; c < Character.MAX_VALUE; c++) {
			index += 1;
			System.out.printf("%-15s", c + "-" + index);
			if (index % 10 == 0)
				System.out.println("");
		}
	}
}