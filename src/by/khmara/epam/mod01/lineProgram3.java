package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3. Вычислить значение выражение по формуле b + (sinX+cosY) / (cosx-siny) * tg(XY)
 */

public class lineProgram3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число x");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите число y");
        int y = Integer.parseInt(reader.readLine());

        double a = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("a = "+ a);
    }
}