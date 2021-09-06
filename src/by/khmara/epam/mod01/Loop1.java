package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. Ввести число и найти сумму целых чисел от 1 до введенного числа
 */

public class Loop1 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите целое положительное число");
		int x = Integer.parseInt(reader.readLine());

		int sum = 0;
		for (int i = 0; i < x; i++)
			sum = sum + i;
		System.out.println("Сумма чисел от одного до " + x + " равна " + "[" + sum + "]");
	}
}