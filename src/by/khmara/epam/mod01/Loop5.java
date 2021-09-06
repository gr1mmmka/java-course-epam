package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
 * 5. Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному e. Общий член ряда имеет вид:
 *  a = 1/2^n + 1/3^n
 */

public class Loop5 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите количество членов в последовательности");
		int n = Integer.parseInt(reader.readLine());
		System.out.println("Введите число е, с которым будем сравнивать");
		double e = Double.parseDouble(reader.readLine());

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(a) >= e)
				sum += a;
		}
		DecimalFormat df = new DecimalFormat("###.###");
		System.out.println("Сумма равна " + df.format(sum));
	}
}