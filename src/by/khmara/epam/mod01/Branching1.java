package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. Даны два угла в градусах. Определить по двум углам существует ли треугольник 
 * и является ли он прямоугольным
 */

public class Branching1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два угла");
        int X = Integer.parseInt(reader.readLine());
        int Y = Integer.parseInt(reader.readLine());

        if ( (X+Y)<180)
            if (X==90 || Y==90 || (180 -(X+Y))==90)
                System.out.print("Треугольник существует и является прямоугольным");
            else
                System.out.println("Треугольник существует");
    }
}