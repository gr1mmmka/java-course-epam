package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 8. Даны два числа. Определить цифры входящие в первое и второе числа
 */

public class Loop8 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите отрезо от m до n");
		int m = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		ArrayList<Integer> listOfM = new ArrayList<>();
		ArrayList<Integer> listOfN = new ArrayList<>();

		while (m > 0 && n > 0) {
			int separateM = m % 10;
			listOfM.add(separateM);
			int separateN = n % 10;
			listOfN.add(separateN);
			m /= 10;
			n /= 10;
		}
		System.out.print("Первое число состоит из следующих цифр: ");
		for (int x : listOfM)
			System.out.print(x + " ");
		System.out.print("\nВторое число состоит из следующих цифр: ");
		for (int y : listOfN)
			System.out.print(y + " ");
	}
}