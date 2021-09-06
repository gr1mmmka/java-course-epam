package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2. Вычислить значение y = x, x > 2 или y = -x, x<=2 на отрезке [a,b] с шагом h
 */

public class Loop2 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите длину отрезка [a,b]");
		double a = Integer.parseInt(reader.readLine());
		double b = Integer.parseInt(reader.readLine());

		System.out.println("Введите значение х");
		double x = Integer.parseInt(reader.readLine());

		System.out.println("Введите значение шага h");
		double h = Double.parseDouble(reader.readLine());

		double f = a;
		if (x > 2) {
			System.out.println("Значение функции с шагом " + h + " равно: " + "\n" + a);
			for (double i = a; i < b; i = i + h) {
				f = f + h;
				System.out.println(f);
			}
		} else {
			System.out.println("Значение функции с шагом " + h + " равно: " + "\n" + (0 - a));
			for (double i = a; i < b; i = i + h) {
				f = f + h;
				System.out.println(0 - f);
			}
		}
	}
}