package by.khmara.epam.mod01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 4. Определить пройдет ли кирпич с параметрами x y z через прямоугольное отверстие с параметрами A B
 */

public class Branching4 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите размеры отверстия(длина, ширина");
		double A = Integer.parseInt(reader.readLine());
		double B = Integer.parseInt(reader.readLine());
		System.out.println("Введите размеры кирпича(длина, ширина, высота)");
		double x = Integer.parseInt(reader.readLine());
		double y = Integer.parseInt(reader.readLine());
		double z = Integer.parseInt(reader.readLine());

		if (A > x && B > y)
			System.out.print("Кирпич пройдет через отверстие");
		else
			System.out.println("Не пройдет");
	}
}