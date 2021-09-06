package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 5. Определить значение функции F(x) = x^2 -3*x +9, если х<=3 и F(x) = 1 / (x^2-6), если x>3
 */

public class Branching5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите х");
        double x = Integer.parseInt(reader.readLine());

        if (x<=3) {
            double f = Math.pow(x,2)-3*x + 9;
            System.out.println("Значение функции при х<=3 равно = " + f);
        } else {
            double f = 1 / (Math.pow(x,3)+6);
            System.out.println("Значение функции при x>3 равно = " + f);
        }
    }
}