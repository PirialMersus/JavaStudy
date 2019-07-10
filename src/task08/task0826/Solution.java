package task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int buffer;
        for (int j = 0; j<array.length; j ++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
    }
}
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.

Требования:
•	Программа должна выводить числа на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать два метода.
•	Метод sort() должен сортировать массив чисел от большего к меньшему.
•	Метод main() должен вызывать метод sort().
•	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
 */