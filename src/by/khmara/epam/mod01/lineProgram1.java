package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. Найти значение функции z = ((a - 3) * b / 2) + c
 */

public class lineProgram1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите а");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите b");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите c");
        int c = Integer.parseInt(reader.readLine());

        int z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}