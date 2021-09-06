package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2. Найти max{min(a,b), min(c,d)}
 */

public class Branching2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите четыре числа");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.print("Максимальное значение из минимальных равно " + max);
    }
}