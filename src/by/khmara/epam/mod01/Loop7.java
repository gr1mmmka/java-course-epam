package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 7. Для всех чисел от m до n вывести делители, кроме 1 и самого числа
 */

public class Loop7 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите отрезо от m до n");
		int m = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());

		for (int i = m; i <= n; i++) {
			int count = 0;
			System.out.print("Делителями числа " + i + " являются: ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					System.out.print(j + " ");
				}
			}
			if (count == 0) {
				System.out.print("Нет делителей");
			}
			System.out.println();
		}
	}
}