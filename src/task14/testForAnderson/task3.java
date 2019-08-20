package task14.testForAnderson;

/*
Составить алгоритм:
на входе есть числовой массив, необходимо вывести элементы массива кратные 3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    public static void main(String[] args) throws IOException {

        {
            System.out.println("Введите количество элементов массива");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            int length = Integer.parseInt(s);
            Integer[] list = new Integer[length];

            for (int i = 0; i < length; i++) {
                System.out.println("Введите элемент " + i);
                String k = reader.readLine();
                list[i] = Integer.parseInt(k);
            }

            System.out.println("Элементы кратные 3: ");
            for (int i = 0; i < list.length; i++) {
                if (list[i] % 3 == 0)
                    System.out.println(list[i]);
            }
        }

    }
}
