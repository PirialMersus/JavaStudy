package task14.testForAnderson;

/*Составить алгоритм:
если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
если нет, то вывести "Нет такого имени"
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.equals("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");

    }
}
