package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3. Даны три точки, определить, лежат ли он на одной прямой
 */

public class Branching3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите координаты первой точки");
        double x1 = Integer.parseInt(reader.readLine());
        double y1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты второй точки");
        double x2 = Integer.parseInt(reader.readLine());
        double y2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты третьей точки");
        double x3 = Integer.parseInt(reader.readLine());
        double y3 = Integer.parseInt(reader.readLine());

        if ( (x3-x1)/(x2-x1)==(y3-y1)/(y2-y1) )
            System.out.print("Точки лежат на одной прямой");
        else
            System.out.println("Точки не лежат на одной прямой");
    }
}