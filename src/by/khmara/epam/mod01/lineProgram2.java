package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2. Вычислить выражение по формуле: b + sqrt(b^2 + 4*a*c) * 1/(2*a)  - a^3*c + b^(-2)
 */

public class lineProgram2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите число b");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите число c");
        int c = Integer.parseInt(reader.readLine());

        double x = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / (2*a) - Math.pow(a,3)*c + Math.pow(b,-2);
        System.out.println("x = "+ x);
    }
}