package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 4. Дано число х типа ддд.ннн. Переставить местами целую и дробную части 
 * и вывести полученое значение
 */

public class lineProgram4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число x");
        double x = Double.parseDouble(reader.readLine());
        double a = (int) x;
        double b = (int) ((x-a)*1000);

        double answer = b + a / 1000;
        System.out.println(answer);
    }
}