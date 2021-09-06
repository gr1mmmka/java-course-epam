package by.khmara.epam.mod01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  5. Дано время Т в секундах. Представить в часах, минутах, секундах. HHч MMмин SSс)
 */

public class lineProgram5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите время T");
        int T = Integer.parseInt(reader.readLine());
        int hours = T / 3600;
        int minutes = (T - hours*3600) / 60;
        int seconds = T - hours*3600 - minutes*60;


        System.out.print(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}