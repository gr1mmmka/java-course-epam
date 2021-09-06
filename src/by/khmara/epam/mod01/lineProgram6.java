package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 6. Для данной области составить программу, которая печатает true если 
 * точка (х,у) принадлежит области (-2,4) && (2,4) или (4,-3) && (-4,-3)
 * в противном случае false
 */

public class lineProgram6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите точку с координатами Х");
        int X = Integer.parseInt(reader.readLine());
        System.out.println("Введите точку с координатами Y");
        int Y = Integer.parseInt(reader.readLine());

        if ( X<=2 && X>=-2 && Y<=4 && Y>=0 || X<=4 && X>=-4 && Y<=0 && Y>=-3 )
            System.out.println(true);
        else
            System.out.println(false);


    }
}